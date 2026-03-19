package com.example.lesson02_configuration.config;

import com.example.lesson02_configuration.service.AppDatabase;
import com.example.lesson02_configuration.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configures beans for the application context.
 */
@Configuration
public class AppConfig {

    /**
     * Creates an AppDatabase bean with default connection settings.
     *
     * @return a configured AppDatabase instance
     */
    @Bean
    public AppDatabase appDatabase() {

        return new AppDatabase("jdbc:mysql://localhost:3306/mydb", "root");
    }


    /**
     * Creates a UserService bean with an AppDatabase dependency.
     *
     * @return a configured UserService instance
     */
    @Bean
    public UserService userService() {

        return new UserService( appDatabase() );
    }


}
