package com.icaballero.hexagonal.application.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.icaballero.hexagonal.domain.Product;

public class CreateOrderRequest {
	@NotNull
	private Product product;

	@JsonCreator
	public CreateOrderRequest(@JsonProperty("product") @NotNull final Product product) {
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

}
