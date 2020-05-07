package com.zomato.pojoModels;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class GetCities {
	
	private List<GetCitiesValues> location_suggestions;
	public List<GetCitiesValues> getLocation_suggestions() {
		return location_suggestions;
	}
	public void setLocation_suggestions(List<GetCitiesValues> location_suggestions) {
		this.location_suggestions = location_suggestions;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getHas_more() {
		return has_more;
	}
	public void setHas_more(int has_more) {
		this.has_more = has_more;
	}
	public int getHas_total() {
		return has_total;
	}
	public void setHas_total(int has_total) {
		this.has_total = has_total;
	}
	public Boolean getUser_has_addresses() {
		return user_has_addresses;
	}
	public void setUser_has_addresses(Boolean user_has_addresses) {
		this.user_has_addresses = user_has_addresses;
	}
	private String status;
	private int has_more;
	private int has_total;
	private Boolean user_has_addresses;
	

}
