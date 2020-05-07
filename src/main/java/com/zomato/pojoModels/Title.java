package com.zomato.pojoModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Title {
	
	private float text;

	public float getText() {
		return text;
	}

	public void setText(float text) {
		this.text = text;
	} 

}
