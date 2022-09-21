package com.icaballero.hexagonal.domain.repository;

import java.util.Optional;
import java.util.UUID;

import com.icaballero.hexagonal.domain.Order;

public interface OrderRepository {
    Optional<Order> findById(UUID id);

    void save(Order order);
}
