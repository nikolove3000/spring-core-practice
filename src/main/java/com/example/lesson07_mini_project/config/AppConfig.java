package com.example.lesson07_mini_project.config;

import com.example.lesson07_mini_project.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Main application configuration that imports other configurations
 * and provides the OrderService bean.
 */
@Configuration
@PropertySource("classpath:application.properties")
@Import({DatabaseConfig.class, NotificationConfig.class, PaymentConfig.class, DiscountConfig.class})
public class AppConfig {

    /**
     * Creates an OrderService bean with all required dependencies.
     * @param emailSender injected EmailSender bean
     * @param databaseService injected DatabaseService bean
     * @param paymentService injected PaymentService bean
     * @param discountService injected DiscountService bean (optional, may be null)
     * @return a configured OrderService instance
     */
    @Bean
    public OrderService orderService(EmailSender emailSender,
                                     DatabaseService databaseService,
                                     PaymentService paymentService,
                                     @Autowired(required = false) DiscountService discountService) {
        OrderService os = new OrderService(emailSender, databaseService, paymentService);
        if (discountService != null) {
            os.setDiscountService(discountService);
        }
        return os;
    }
}
