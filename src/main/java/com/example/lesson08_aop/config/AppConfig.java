package com.example.lesson08_aop.config;

import com.example.lesson08_aop.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring configuration for the AOP module.
 * Enables AspectJ auto-proxying and component scanning for the service and aspect packages.
 */
@Configuration
@ComponentScan("com.example.lesson08_aop")
@EnableAspectJAutoProxy
public class AppConfig {

    /**
     * Creates an OrderService bean.
     * @return a new OrderService instance
     */
    @Bean
    public OrderService orderService() {

        return new OrderService();
    }
}
