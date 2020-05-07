package com.zomato.genericUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	private Properties properties;

	private final String propertyFilePath = ".\\Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getBaseURI() {
		String URI = properties.getProperty("base_URI");
		if (URI != null)
			return URI;
		else
			throw new RuntimeException("baseURI not specified in the Configuration.properties file.");
	}

	public String getToken() {
		String token = properties.getProperty("token");
		if (token != null)
			return token;
		else
			throw new RuntimeException("Token not specified in the Configuration.properties file.");
	}

	public String getCategoriesResource() {
		String getCategoriesResource = properties.getProperty("getCategoriesResource");
		if (getCategoriesResource != null)
			return getCategoriesResource;
		else
			throw new RuntimeException("getCategoriesResource not specified in the Configuration.properties file.");
	}
	
	public String getCityResource() {
		String getCityResource = properties.getProperty("getCityResource");
		if (getCityResource != null)
			return getCityResource;
		else
			throw new RuntimeException("getCityResource not specified in the Configuration.properties file.");
	}
	
	public String getCityCuisines() {
		String getCityCuisines = properties.getProperty("getCityCuisines");
		if (getCityCuisines != null)
			return getCityCuisines;
		else
			throw new RuntimeException("getCityCuisines not specified in the Configuration.properties file.");
	}
	
	
	public String getEstablishments() {
		String getEstablishments = properties.getProperty("getEstablishments");
		if (getEstablishments != null)
			return getEstablishments;
		else
			throw new RuntimeException("getEstablishments not specified in the Configuration.properties file.");
	}
	
	public String getID() {
		String getID = properties.getProperty("getID");
		if (getID != null)
			return getID;
		else
			throw new RuntimeException("getID not specified in the Configuration.properties file.");
	}
	
	public String getResReviews() {
		String getResReviews = properties.getProperty("getResReviews");
		if (getResReviews != null)
			return getResReviews;
		else
			throw new RuntimeException("getResReviews not specified in the Configuration.properties file.");
	}
	
}
