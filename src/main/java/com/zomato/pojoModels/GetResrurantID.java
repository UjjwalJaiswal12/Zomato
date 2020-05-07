package com.zomato.pojoModels;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetResrurantID {
	
	private LocationValues location;
	private List<Restaurants> nearby_restaurants;
	private Popularity popularity;
	private String link;
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Popularity getPopularity() {
		return popularity;
	}
	public void setPopularity(Popularity popularity) {
		this.popularity = popularity;
	}
	public LocationValues getLocation() {
		return location;
	}
	public void setLocation(LocationValues location) {
		this.location = location;
	}
	public List<Restaurants> getNearby_restaurants() {
		return nearby_restaurants;
	}
	public void setNearby_restaurants(List<Restaurants> nearby_restaurants) {
		this.nearby_restaurants = nearby_restaurants;
	}
	

}
