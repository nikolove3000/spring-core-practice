package com.example.lesson07_mini_project.config;

import com.example.lesson07_mini_project.service.DatabaseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Application configuration class that loads database properties
 * and creates related beans.
 */
@Configuration
@PropertySource("classpath:application.properties")
public class DatabaseConfig {

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    /**
     * Creates a DatabaseService bean using values
     * loaded from application.properties.
     * @return configured DatabaseService instance
     */
    @Bean
    public DatabaseService databaseService() {

        return new DatabaseService(url, username);
    }


}
