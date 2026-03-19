package com.example.lesson04_scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Configures beans for the application context.
 */
@Configuration
public class AppConfig {

    /**
     * Creates a SingletonService bean.
     * @return  a configured SingletonService instance
     */
    @Bean
    public SingletonService singletonService() {

        return new SingletonService();

    }

    /**
     * Creates a prototypeService bean
     * @return  a configured PrototypeService instance
     */
    @Bean
    @Scope("prototype")
    public PrototypeService prototypeService() {
        return new PrototypeService();
    }
}
