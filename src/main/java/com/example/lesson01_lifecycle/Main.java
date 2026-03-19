package com.example.lesson01_lifecycle;

import com.example.lesson02_configuration.service.AppDatabase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.lesson01_lifecycle")
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        AppDatabase db = context.getBean(AppDatabase.class);
        db.connect();
        context.close();
    }

}
