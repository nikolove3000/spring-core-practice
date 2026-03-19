package com.example.lesson08_aop;

import com.example.lesson08_aop.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Entry point for the AOP module application.
 * Initializes Spring context and demonstrates order operations
 * with logging aspects applied.
 */
@ComponentScan("com.example.lesson08_aop")
public class Main {

    /**
     * Main method to start the AOP application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(Main.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder("a123");
        orderService.cancelOrder("a123");

        context.close();
    }

}
