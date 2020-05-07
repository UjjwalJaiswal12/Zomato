

package com.zomato.businessHelper;

import com.zomato.pojoModels.GetCategories;
import com.zomato.pojoModels.GetCities;
import com.zomato.pojoModels.GetCuisine;
import com.zomato.pojoModels.GetEstablishments;
import com.zomato.pojoModels.GetResrurantID;
import com.zomato.pojoModels.GetReviews;

public class Helper {
	
	
	public boolean isCategoriePeresent(GetCategories responseGetCategories, String name){
		boolean isPresent=false;
		
		for(int i=0;i<=responseGetCategories.getCategories().size()-1;i++){
			
			if(responseGetCategories.getCategories().get(i).getCategories().getName().equalsIgnoreCase(name)){
				
				System.out.println(responseGetCategories.getCategories().get(i).getCategories().getName());
				isPresent=true;
				break;
			}
		}
		
		
		return isPresent;
		
		
	}
	

	public boolean getCityCuisines(GetCuisine responseGetCityCuisines, String name){
		boolean isPresent=false;
		
		for(int i=0;i<=responseGetCityCuisines.getCuisines().size()-1;i++){
			
			if(responseGetCityCuisines.getCuisines().get(i).getCuisine().getCuisine_name().equalsIgnoreCase(name)){
				
				System.out.println(responseGetCityCuisines.getCuisines().get(i).getCuisine().getCuisine_name());
				isPresent=true;
				break;
			}
		}
		
		
		return isPresent;
		
		
	}
	
	
	public boolean getEstablishment(GetEstablishments responseGetEstablishments, String name){
		boolean isPresent=false;
		
		for(int i=0;i<=responseGetEstablishments.getEstablishments().size()-1;i++){
			
			if(responseGetEstablishments.getEstablishments().get(i).getEstablishment().getName().equalsIgnoreCase(name)){
				
				System.out.println(responseGetEstablishments.getEstablishments().get(i).getEstablishment().getName());
				isPresent=true;
				break;
			}
		}
		
		
		return isPresent;
		
		
	}
	
	
	
	
	
	
	public int getCityID(GetCities responsegetCityResource, String name){
		
		System.out.println(responsegetCityResource.getLocation_suggestions().get(0).getName());
		int resID=responsegetCityResource.getLocation_suggestions().get(0).getId();
		
		
		return resID;
		
		
	}
	
	
	
	
	
	public int getResID(GetResrurantID responsegetID, String name){
		int ID = 0;
		
		for(int i=0; i<=responsegetID.getNearby_restaurants().size()-1;i++){
			if(responsegetID.getNearby_restaurants().get(i).getRestaurant().getName().equalsIgnoreCase(name)){
				ID=responsegetID.getNearby_restaurants().get(i).getRestaurant().getId();
				System.out.println(ID);
			}
					
			}	
		
		
		
		return ID;
		}

	public String getResAddress(GetResrurantID responsegetID, String name){
		 String add = null;
		
		for(int i=0; i<=responsegetID.getNearby_restaurants().size()-1;i++){
			if(responsegetID.getNearby_restaurants().get(i).getRestaurant().getName().equalsIgnoreCase(name)){
				add=responsegetID.getNearby_restaurants().get(i).getRestaurant().getLocation().getAddress();
				
			}
					
			}	
		
		
		
		return add;
		}
	
	public Boolean goNoGo(GetReviews responseGetReviews){
		 
		Boolean go = false;
		int rating =0;
		int numberOfRating=responseGetReviews.getUser_reviews().size();
		for(int i=0; i<=numberOfRating-1;i++){
			
			rating=rating+responseGetReviews.getUser_reviews().get(i).getReview().getRating();
			}
		
		if(rating/numberOfRating >=4){
			
			go = true;
		}
		
		return go;
		}
	
	

	
}
