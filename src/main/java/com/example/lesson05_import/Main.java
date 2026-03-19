package com.example.lesson05_import;

import com.example.lesson05_import.service.DatabaseService;
import com.example.lesson05_import.service.EmailSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.lesson05_import.config")
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(Main.class);

        DatabaseService databaseService = context.getBean(DatabaseService.class);
        EmailSender emailSender = context.getBean(EmailSender.class);
        emailSender.send("Hello");
        System.out.println(databaseService.getUrl());

        context.close();

    }
}
