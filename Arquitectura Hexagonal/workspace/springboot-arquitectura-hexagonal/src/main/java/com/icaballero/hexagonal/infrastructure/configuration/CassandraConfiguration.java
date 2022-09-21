package com.icaballero.hexagonal.infrastructure.configuration;

import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import com.icaballero.hexagonal.infrastructure.repository.cassandra.SpringDataCassandraOrderRepository;

@EnableCassandraRepositories(basePackageClasses = SpringDataCassandraOrderRepository.class)
public class CassandraConfiguration {

}
