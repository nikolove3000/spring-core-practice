package com.example.lesson07_mini_project.service;

import com.example.lesson07_mini_project.model.Order;

/**
 * PaymentService implementation for production environment.
 * Processes real payments for orders.
 */
public class ProdPaymentService implements PaymentService {

    /**
     * Processes payment for the given order in production.
     *
     * @param order order to process
     */
    @Override
    public void processPayment(Order order) {

        System.out.println("[PROD] Real payment processed for order: " + order.getOrderId() + " - " + order.getPrice());
    }
}
