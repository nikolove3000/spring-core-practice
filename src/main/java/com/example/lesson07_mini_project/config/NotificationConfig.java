package com.example.lesson07_mini_project.config;

import com.example.lesson07_mini_project.service.EmailSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for notification-related beans.
 */
@Configuration
public class NotificationConfig {

    /**
     * Creates an EmailSender bean.
     * @return a new EmailSender instance
     */
    @Bean
    public EmailSender emailSender() {
        return new EmailSender();
    }
}
