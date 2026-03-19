package com.example.lesson05_import.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Adds beans from the email sender and database to context.
 */
@Configuration
@Import({DatabaseConfig.class, EmailConfig.class})
public class AppConfig {

}
