package com.icaballero.hexagonal.infrastructure.repository.mongo;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.icaballero.hexagonal.domain.Order;

@Repository
public interface SpringDataMongoOrderRepository extends MongoRepository<Order, UUID> {

}
