package com.icaballero.hexagonal.domain;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.Data;

@Data
public final class OrderItem {
	
    private UUID productId;
    private BigDecimal price;

    public OrderItem(final Product product) {
        this.productId = product.getId();
        this.price = product.getPrice();
    }


}
