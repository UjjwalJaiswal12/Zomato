package com.zomato.pojoModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Establishments {
	
	private EstablishmentsValues establishment;

	public EstablishmentsValues getEstablishment() {
		return establishment;
	}

	public void setEstablishment(EstablishmentsValues establishment) {
		this.establishment = establishment;
	}

}
