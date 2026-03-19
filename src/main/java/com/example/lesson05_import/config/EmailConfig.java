package com.example.lesson05_import.config;

import com.example.lesson05_import.service.EmailSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configures beans for the email sender context.
 */
@Configuration
public class EmailConfig {

    /**
     * Creates a new EmailSender bean
     * @return a configured EmailSender instance
     */
    @Bean
    public EmailSender emailSender() {

        return new EmailSender();

    }

}
