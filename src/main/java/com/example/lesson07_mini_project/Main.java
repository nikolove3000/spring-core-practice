package com.example.lesson07_mini_project;

import com.example.lesson07_mini_project.model.Order;
import com.example.lesson07_mini_project.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Entry point for the mini project application.
 * Initializes Spring context and demonstrates placing an order.
 */
@ComponentScan("com.example.lesson07_mini_project")
public class Main {

    /**
     * Main method to start the application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(Main.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder(new Order("a123", "Phone", 20));
        context.close();

    }
}
