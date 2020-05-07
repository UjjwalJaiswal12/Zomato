package com.zomato.pojoModels;

public class Popularity {
	
	private String popularity;
	
	private String nightlife_index;
	private int[] nearby_res;
	private String[] top_cuisines;
	private int popularity_res;
	private int nightlife_res;
	private String subzone;
	private int subzone_id;
	private String city;
	
	public String getPopularity() {
		return popularity;
	}
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}
	public String getNightlife_index() {
		return nightlife_index;
	}
	public void setNightlife_index(String nightlife_index) {
		this.nightlife_index = nightlife_index;
	}
	public int[] getNearby_res() {
		return nearby_res;
	}
	public void setNearby_res(int[] nearby_res) {
		this.nearby_res = nearby_res;
	}
	public String[] getTop_cuisines() {
		return top_cuisines;
	}
	public void setTop_cuisines(String[] top_cuisines) {
		this.top_cuisines = top_cuisines;
	}
	public int getPopularity_res() {
		return popularity_res;
	}
	public void setPopularity_res(int popularity_res) {
		this.popularity_res = popularity_res;
	}
	public int getNightlife_res() {
		return nightlife_res;
	}
	public void setNightlife_res(int nightlife_res) {
		this.nightlife_res = nightlife_res;
	}
	public String getSubzone() {
		return subzone;
	}
	public void setSubzone(String subzone) {
		this.subzone = subzone;
	}
	public int getSubzone_id() {
		return subzone_id;
	}
	public void setSubzone_id(int subzone_id) {
		this.subzone_id = subzone_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
