package com.zomato.pojoModels;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class GetEstablishments {
	
	private List<Establishments> establishments;

	public List<Establishments> getEstablishments() {
		return establishments;
	}

	public void setEstablishments(List<Establishments> establishments) {
		this.establishments = establishments;
	}

	
}
