package com.example.lesson02_configuration;

import com.example.lesson02_configuration.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.lesson02_configuration")
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        UserService us = context.getBean(UserService.class);
        us.findUser("Nguyen Van A");
        context.close();

    }

}
