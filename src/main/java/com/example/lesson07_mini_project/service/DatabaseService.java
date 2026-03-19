package com.example.lesson07_mini_project.service;

import com.example.lesson07_mini_project.model.Order;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


/**
 * Service responsible for simulating database operations for orders.
 */
public class DatabaseService {

    private final String url;
    private final String username;

    /**
     * Creates a DatabaseService with database connection information.
     * @param url database URL
     * @param username database username
     */
    public DatabaseService(String url, String username) {
        this.url = url;
        this.username = username;
    }

    /**
     * Initializes the database connection after bean creation.
     */
    @PostConstruct
    private void postConstruct() {

        System.out.println("Kết nối database: " + url + " với user: " + username);
    }

    /**
     * Closes the database connection before bean destruction.
     */
    @PreDestroy
    private void preDestroy() {

        System.out.println("Đóng kết nối database");
    }

    /**
     * Saves an order to the database (simulation).
     * @param order order to be saved
     */
    public void saveOrder(Order order) {

        System.out.println("Lưu đơn hàng: " + order.getOrderId() + " - " +
                            order.getProductName() + " - " + order.getPrice());
    }

}
