package com.example.lesson07_mini_project.config;

import com.example.lesson07_mini_project.service.DevPaymentService;
import com.example.lesson07_mini_project.service.PaymentService;
import com.example.lesson07_mini_project.service.ProdPaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Configuration for PaymentService beans.
 */
@Configuration
public class PaymentConfig {

    /**
     * Creates a PaymentService bean for development/testing.
     * @return a new DevPaymentService instance
     */
    @Bean
    @Profile("dev")
    public PaymentService devPaymentService() {

        return new DevPaymentService();
    }

    /**
     * Creates a PaymentService bean for production environment.
     * @return a new ProdPaymentService instance
     */
    @Bean
    @Profile("prod")
    public PaymentService prodPaymentService() {

        return new ProdPaymentService();
    }
}
