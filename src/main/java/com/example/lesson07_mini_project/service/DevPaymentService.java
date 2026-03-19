package com.example.lesson07_mini_project.service;

import com.example.lesson07_mini_project.model.Order;

/**
 * PaymentService implementation for development/testing.
 * Simulates payment processing without real transactions.
 */
public class DevPaymentService implements PaymentService {

    /**
     * Processes a fake payment for the given order (development only).
     *
     * @param order order to process
     */
    @Override
    public void processPayment(Order order) {

        System.out.println("[DEV] Fake payment processed for order: " + order.getOrderId() + " - " + order.getPrice());
    }
}
