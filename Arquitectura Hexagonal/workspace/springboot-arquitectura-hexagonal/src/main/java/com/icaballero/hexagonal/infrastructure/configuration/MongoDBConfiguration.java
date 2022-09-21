package com.icaballero.hexagonal.infrastructure.configuration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.icaballero.hexagonal.infrastructure.repository.mongo.SpringDataMongoOrderRepository;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoOrderRepository.class)
public class MongoDBConfiguration {

}
