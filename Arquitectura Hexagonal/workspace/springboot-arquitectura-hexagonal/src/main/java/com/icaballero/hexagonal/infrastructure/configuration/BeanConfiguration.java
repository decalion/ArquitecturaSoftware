package com.icaballero.hexagonal.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.icaballero.hexagonal.SpringbootArquitecturaHexagonalApplication;
import com.icaballero.hexagonal.domain.repository.OrderRepository;
import com.icaballero.hexagonal.domain.service.DomainOrderService;
import com.icaballero.hexagonal.domain.service.OrderService;

@Configuration
@ComponentScan(basePackageClasses = SpringbootArquitecturaHexagonalApplication.class)
public class BeanConfiguration {

    @Bean
    OrderService orderService(final OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}
