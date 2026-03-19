package com.example.lesson06_value;

import com.example.lesson06_value.service.DatabaseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.lesson06_value")
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(Main.class);

        DatabaseService databaseService = context.getBean(DatabaseService.class);

        databaseService.connect();

        context.close();

    }
}
