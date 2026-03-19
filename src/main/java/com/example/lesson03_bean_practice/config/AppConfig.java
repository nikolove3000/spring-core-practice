package com.example.lesson03_bean_practice.config;

import com.example.lesson03_bean_practice.service.EmailSender;
import com.example.lesson03_bean_practice.service.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configures beans for the application context.
 */
@Configuration
public class AppConfig {

    /**
     * Creates an EmailSender bean with default SMTP settings.
     * @return a configured EmailSender instance
     */
    @Bean
    public EmailSender emailSender() {

        return new EmailSender("smtp.gmail.com", 587);
    }

    /**
     *Creates a NotificationService bean with an EmailSender dependency.
     * @return a configured NotificationService instance
     */
    @Bean
    public NotificationService notificationService() {

        return new NotificationService(emailSender());
    }

}
