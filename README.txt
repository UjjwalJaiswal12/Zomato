//////////////////////////////////////////////
Name of the Maven project
"Zomato"
//////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////
Description
"This project is to test the basic functionality of Zomato
link --->https://developers.zomato.com
//////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////
Required Maven Dependencies
Rest assured,json-path,testng,java-hamcrest

#Only opensourced dependencies were used
//////////////////////////////////////////////

//////////////////////////////////////////////
Support
Get Categories
Get CityID
Get CityCuisines
Get Establishments
Get ResturantID
Checks the rating
Then take the descision Go or NoGo


 

//////////////////////////////////////////////

//////////////////////////////////////////////
Flow of the Framework

*From before methods its read the Configurations file(Constant value)
*Build the RequestSpecification
*Performs the Functionality
*Deserialize the Json into Java object using POJO
*Call the helper class for validation
*Helper class returns the Response data into HashMap
*Validate the response and mark the test as pass/fail
*Tell the reason of the failure in case of Failure
//////////////////////////////////////////////

//////////////////////////////////////////////
Framework can be run from 

1) TestNg.xml file as suite
2) Run as TestNg test from GetResturant.java
//////////////////////////////////////////////
