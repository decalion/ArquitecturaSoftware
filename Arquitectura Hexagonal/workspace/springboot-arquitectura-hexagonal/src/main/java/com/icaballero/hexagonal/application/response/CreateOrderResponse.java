package com.icaballero.hexagonal.application.response;

import java.util.UUID;

public final class CreateOrderResponse {
	
    private final UUID id;

    public CreateOrderResponse(final UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

}
