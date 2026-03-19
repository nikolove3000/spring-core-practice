package com.example.lesson03_bean_practice;

import com.example.lesson03_bean_practice.service.NotificationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.lesson03_bean_practice")
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        NotificationService notificationService = context.getBean(NotificationService.class);

        notificationService.notifyUser("Thanh");

    }

}
