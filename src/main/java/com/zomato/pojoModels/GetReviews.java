package com.zomato.pojoModels;

import java.util.List;

public class GetReviews {
	private int reviews_count; 
	private int reviews_start;
	private int reviews_shown;
	private List<User_Reviews> user_reviews;
	
	public int getReviews_count() {
		return reviews_count;
	}
	public void setReviews_count(int reviews_count) {
		this.reviews_count = reviews_count;
	}
	public int getReviews_start() {
		return reviews_start;
	}
	public void setReviews_start(int reviews_start) {
		this.reviews_start = reviews_start;
	}
	public int getReviews_shown() {
		return reviews_shown;
	}
	public void setReviews_shown(int reviews_shown) {
		this.reviews_shown = reviews_shown;
	}
	public List<User_Reviews> getUser_reviews() {
		return user_reviews;
	}
	public void setUser_reviews(List<User_Reviews> user_reviews) {
		this.user_reviews = user_reviews;
	}
	
	
	
	
	
	
	

}
