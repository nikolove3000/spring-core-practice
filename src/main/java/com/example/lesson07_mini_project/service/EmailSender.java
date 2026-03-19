package com.example.lesson07_mini_project.service;

import com.example.lesson07_mini_project.model.Order;

/**
 * Service responsible for sending emails related to orders.
 */
public class EmailSender {

    /**
     * Sends a confirmation email for the given order.
     * @param order order to send confirmation for
     */
    public void sendConfirmation(Order order) {

        System.out.println("Gửi email xác nhận đơn hàng: " + order.getOrderId() + " - "
                + order.getProductName());

    }
}
