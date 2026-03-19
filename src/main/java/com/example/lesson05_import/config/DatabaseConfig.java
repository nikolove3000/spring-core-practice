package com.example.lesson05_import.config;

import com.example.lesson05_import.service.DatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configures beans for the database context.
 */
@Configuration
public class DatabaseConfig {

    /**
     * Creates a new DatabaseService bean
     * @return a configured DatabaseService instance
     */
    @Bean
    public DatabaseService databaseService() {

        return new DatabaseService("jdbc:mysql://localhost:3306");
    }

}
