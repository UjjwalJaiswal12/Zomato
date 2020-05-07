package com.zomato.pojoModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestaurantsValues {
	
	
    
	
	private RVale R;
	private String apikey;
	private int id;
	private String name;
	private String url;
	private Location location;
	private int switch_to_order_menu;
	private String cuisines;
	private int average_cost_for_two;
	private int price_range;
	private String currency;
	private int[] offers;
	
	private int opentable_support;
	private int is_zomato_book_res;
	private String mezzo_provider;
	private int is_book_form_web_view;
	private String book_form_web_view_url;
	private String book_again_url;
	
	private String thumb;
	private User_rating user_rating;
	private String photos_url;
	private String menu_url;
	private String featured_image;
	
	private int has_online_delivery;
	private int is_delivering_now;
	private String store_type;
	private Boolean include_bogo_offers;
	private String deeplink;
	private int is_table_reservation_supported;
	private int has_table_booking;
	private String events_url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public RVale getR() {
		return R;
	}
	public void setR(RVale r) {
		R = r;
	}
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getSwitch_to_order_menu() {
		return switch_to_order_menu;
	}
	public void setSwitch_to_order_menu(int switch_to_order_menu) {
		this.switch_to_order_menu = switch_to_order_menu;
	}
	public String getCuisines() {
		return cuisines;
	}
	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}
	public int getAverage_cost_for_two() {
		return average_cost_for_two;
	}
	public void setAverage_cost_for_two(int average_cost_for_two) {
		this.average_cost_for_two = average_cost_for_two;
	}
	public int getPrice_range() {
		return price_range;
	}
	public void setPrice_range(int price_range) {
		this.price_range = price_range;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int[] getOffers() {
		return offers;
	}
	public void setOffers(int[] offers) {
		this.offers = offers;
	}
	public int getOpentable_support() {
		return opentable_support;
	}
	public void setOpentable_support(int opentable_support) {
		this.opentable_support = opentable_support;
	}
	public int getIs_zomato_book_res() {
		return is_zomato_book_res;
	}
	public void setIs_zomato_book_res(int is_zomato_book_res) {
		this.is_zomato_book_res = is_zomato_book_res;
	}
	public String getMezzo_provider() {
		return mezzo_provider;
	}
	public void setMezzo_provider(String mezzo_provider) {
		this.mezzo_provider = mezzo_provider;
	}
	public int getIs_book_form_web_view() {
		return is_book_form_web_view;
	}
	public void setIs_book_form_web_view(int is_book_form_web_view) {
		this.is_book_form_web_view = is_book_form_web_view;
	}
	public String getBook_form_web_view_url() {
		return book_form_web_view_url;
	}
	public void setBook_form_web_view_url(String book_form_web_view_url) {
		this.book_form_web_view_url = book_form_web_view_url;
	}
	public String getBook_again_url() {
		return book_again_url;
	}
	public void setBook_again_url(String book_again_url) {
		this.book_again_url = book_again_url;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public User_rating getUser_rating() {
		return user_rating;
	}
	public void setUser_rating(User_rating user_rating) {
		this.user_rating = user_rating;
	}
	public String getPhotos_url() {
		return photos_url;
	}
	public void setPhotos_url(String photos_url) {
		this.photos_url = photos_url;
	}
	public String getMenu_url() {
		return menu_url;
	}
	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}
	public String getFeatured_image() {
		return featured_image;
	}
	public void setFeatured_image(String featured_image) {
		this.featured_image = featured_image;
	}
	public int getHas_online_delivery() {
		return has_online_delivery;
	}
	public void setHas_online_delivery(int has_online_delivery) {
		this.has_online_delivery = has_online_delivery;
	}
	public int getIs_delivering_now() {
		return is_delivering_now;
	}
	public void setIs_delivering_now(int is_delivering_now) {
		this.is_delivering_now = is_delivering_now;
	}
	public String getStore_type() {
		return store_type;
	}
	public void setStore_type(String store_type) {
		this.store_type = store_type;
	}
	public Boolean getInclude_bogo_offers() {
		return include_bogo_offers;
	}
	public void setInclude_bogo_offers(Boolean include_bogo_offers) {
		this.include_bogo_offers = include_bogo_offers;
	}
	public String getDeeplink() {
		return deeplink;
	}
	public void setDeeplink(String deeplink) {
		this.deeplink = deeplink;
	}
	public int getIs_table_reservation_supported() {
		return is_table_reservation_supported;
	}
	public void setIs_table_reservation_supported(int is_table_reservation_supported) {
		this.is_table_reservation_supported = is_table_reservation_supported;
	}
	public int getHas_table_booking() {
		return has_table_booking;
	}
	public void setHas_table_booking(int has_table_booking) {
		this.has_table_booking = has_table_booking;
	}
	public String getEvents_url() {
		return events_url;
	}
	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}
	
	
	
	
	

}
