package com.zomato.pojoModels;

public class ReviewValues {
	
	private int rating;
	private int id;
	private String review_text;
	private String rating_color;
	private String review_time_friendly;
	private String rating_text;
	private String timestamp;
	private int likes;
	private int comments_count;
	private UsersDetails user;
	
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReview_text() {
		return review_text;
	}
	public void setReview_text(String review_text) {
		this.review_text = review_text;
	}
	public String getRating_color() {
		return rating_color;
	}
	public void setRating_color(String rating_color) {
		this.rating_color = rating_color;
	}
	public String getReview_time_friendly() {
		return review_time_friendly;
	}
	public void setReview_time_friendly(String review_time_friendly) {
		this.review_time_friendly = review_time_friendly;
	}
	public String getRating_text() {
		return rating_text;
	}
	public void setRating_text(String rating_text) {
		this.rating_text = rating_text;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getComments_count() {
		return comments_count;
	}
	public void setComments_count(int comments_count) {
		this.comments_count = comments_count;
	}
	public UsersDetails getUser() {
		return user;
	}
	public void setUser(UsersDetails user) {
		this.user = user;
	}
	
	
	

}
