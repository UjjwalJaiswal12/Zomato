package com.zomato.pojoModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User_rating {
	private float aggregate_rating;
	private String rating_text;
	private String rating_color;
	private int votes;
	private Rating_obj rating_obj;
	
	public float getAggregate_rating() {
		return aggregate_rating;
	}
	public void setAggregate_rating(float aggregate_rating) {
		this.aggregate_rating = aggregate_rating;
	}
	public String getRating_text() {
		return rating_text;
	}
	public void setRating_text(String rating_text) {
		this.rating_text = rating_text;
	}
	public String getRating_color() {
		return rating_color;
	}
	public void setRating_color(String rating_color) {
		this.rating_color = rating_color;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public Rating_obj getRating_obj() {
		return rating_obj;
	}
	public void setRating_obj(Rating_obj rating_obj) {
		this.rating_obj = rating_obj;
	}
	
	
}
