package com.example.lesson07_mini_project.config;

import com.example.lesson07_mini_project.service.DiscountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for DiscountService bean.
 * The bean is only created if the DiscountCondition evaluates to true.
 */
@Configuration
public class DiscountConfig {

    /**
     * Creates a DiscountService bean if the discount feature is enabled.
     * @return a new DiscountService instance
     */
    @Bean
    @Conditional(DiscountCondition.class)
    public DiscountService discountService() {

        return new DiscountService();
    }
}
