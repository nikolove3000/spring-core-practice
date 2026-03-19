package com.example.lesson07_mini_project.service;

import com.example.lesson07_mini_project.model.Order;

/**
 * Defines payment processing behavior for orders.
 */
public interface PaymentService {

    /**
     * Processes payment for the given order.
     *
     * @param order order to be processed
     */
    void processPayment(Order order);
}
