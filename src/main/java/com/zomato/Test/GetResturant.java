
/**
 * This GetResturant file is to test the basic functionality of Zomato
 
 * 
 * 
 * 
 * 
 * @author Ujjwal Jaiswal
 * @since 2020
*/

package com.zomato.Test;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.zomato.businessHelper.Helper;
import com.zomato.genericUtils.ConfigFileReader;
import com.zomato.pojoModels.GetCategories;
import com.zomato.pojoModels.GetCities;
import com.zomato.pojoModels.GetCuisine;
import com.zomato.pojoModels.GetEstablishments;
import com.zomato.pojoModels.GetResrurantID;
import com.zomato.pojoModels.GetReviews;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class GetResturant {

	String baseURI;
	String key;
	ConfigFileReader config;
	Helper helper;
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	String getCategoriesResource;
	String getCityResource;
	String getCityCuisines;
	String getEstablishments;
	String getResReviews;
	String getID;
	String resName="The Urbanbrava";
	double latitude=23.344101;
	double longitude=85.309563;
	int resId=0;
	int cityID=0;
	String CategorieToSearch="Cafes";
	String cityName="ranchi";
	String CuisinesName="Chinese";
	String Establishment="Café";
	

	@BeforeClass
	public void setup() {
		config = new ConfigFileReader();
		baseURI = config.getBaseURI();
		key = config.getToken();
		getCategoriesResource = config.getCategoriesResource();
		getCityResource = config.getCityResource();
		getCityCuisines=config.getCityCuisines();
		getEstablishments=config.getEstablishments();
		getResReviews=config.getResReviews();
		
		getID=config.getID();
		
		helper = new Helper();

		requestSpec = new RequestSpecBuilder().setBaseUri(baseURI)
				.addHeader("Accept","application/json").addHeader("user-key", key).build();

	}

	@AfterClass
	public void tearDown() {
		config = null;
		helper = null;
		requestSpec = null;
	}

	@Test
	public void getCategories() {

		try{
			RequestSpecification requestGetCategories = given().spec(requestSpec);
			GetCategories responseGetCategories = requestGetCategories.when().get(getCategoriesResource)
					.as(GetCategories.class);
			
		   if( helper.isCategoriePeresent(responseGetCategories, CategorieToSearch)){
			   
			   System.out.println(CategorieToSearch +" is present");
		   }else{
			   Assert.assertTrue(false, CategorieToSearch +"  is not present");
		   }
		   
		}catch (Exception e){
			   
			   System.out.println("getCategories ended up with exception");
			   Assert.assertTrue(false, "Exception occured while searching Categories");
		   }
		   	
		
	}
	
	@Test(dependsOnMethods = { "getCategories" })
	public void GetCityID() {

		try{
			RequestSpecification requestgetCityResource = given().spec(requestSpec).queryParam("q", cityName);
					GetCities responsegetCityResource = requestgetCityResource.when().get(getCityResource)
					.as(GetCities.class);
					
			cityID=helper.getCityID(responsegetCityResource, cityName);
			if(cityID !=0){
				
				System.out.println(cityName +"  Is present in the city list");
			}
			else{
				
				Assert.assertTrue(false, cityName +"  is not present");
			}
		}catch (Exception e){
			   
			   System.out.println("GetCityID ended up with exception");
			   Assert.assertTrue(false, "Exception occured while fetching CityID");
		   }
		
	}
	
	
	@Test(dependsOnMethods = { "GetCityID" })
	public void getCityCuisines() {

		try{
			RequestSpecification requestgetCityCuisines = given().spec(requestSpec).queryParam("city_id", cityID);
			GetCuisine responseGetCityCuisines = requestgetCityCuisines.when().get(getCityCuisines)
					.as(GetCuisine.class);
					
			
			if(helper.getCityCuisines(responseGetCityCuisines,CuisinesName)){
				
				System.out.println(CuisinesName+" Is present in the city");
			}else{
					
					Assert.assertTrue(false, CuisinesName +"  is not present");
				}
			}catch (Exception e){
				   
				   System.out.println("getCityCuisines ended up with exception");
				   Assert.assertTrue(false, "Exception occured while fetching getCityCuisines");
			   }
					
							
}			
	
	
	@Test(dependsOnMethods = { "getCityCuisines" })
	public void getEstablishments() {

		try{
			RequestSpecification requestGetEstablishments = given().spec(requestSpec).queryParam("city_id", cityID);
			GetEstablishments responseGetEstablishments = requestGetEstablishments.when().get(getEstablishments)
					.as(GetEstablishments.class);
					
			
			if(helper.getEstablishment(responseGetEstablishments,Establishment)){
					
			}else{
				
				Assert.assertTrue(false, Establishment +"  is not present");
			}
		}catch (Exception e){
			   
			   System.out.println("getEstablishments ended up with exception");
			   Assert.assertTrue(false, "Exception occured while getEstablishments");
		   }
				
}		
	
	
	@Test(dependsOnMethods = { "getEstablishments" })
	public void getResturantID() {

		try{
			RequestSpecification requestgetID = given().spec(requestSpec).queryParam("lat", latitude).queryParam("lon", longitude);
			GetResrurantID responsegetID = requestgetID.when().get(getID)
					.as(GetResrurantID.class);
			
			 resId=helper.getResID(responsegetID, resName);
			 if(resId!=0){
				 String resAdd=helper.getResAddress(responsegetID, resName);
				 System.out.println(resId);
					System.out.println(resAdd);
				}else{
					
					Assert.assertTrue(false, resName +"  is not present");
				}
			}catch (Exception e){
				   
				   System.out.println("getResturantID ended up with exception");
				   Assert.assertTrue(false, "Exception occured while getResturantID");
			   }
			
			
}			
	
	@Test(dependsOnMethods = { "getResturantID" })
	public void getReviewsAndTakeDesicionGoOrNoGo() {

		try{
			RequestSpecification requestGetReviews = given().spec(requestSpec).queryParam("res_id", resId);
			GetReviews responseGetReviews = requestGetReviews.when().get(getResReviews)
					.as(GetReviews.class);
			
			System.out.println(responseGetReviews.getReviews_shown());
			
			if(helper.goNoGo(responseGetReviews)){
				
				System.out.println("Its a highly rated res, the rating is above or equal to 4--> WE CAN GOAHEAD");
			}else{
				System.out.println("Its a Low rated res, the rating is below  4");
			}
				}catch (Exception e){
			  System.out.println("getReviewsAndTakeDesicionGoOrNoGo ended up with exception");
				   Assert.assertTrue(false, "Exception occured while getReviewsAndTakeDesicionGoOrNoGo");
			   }
			
			
		}
	
	
}