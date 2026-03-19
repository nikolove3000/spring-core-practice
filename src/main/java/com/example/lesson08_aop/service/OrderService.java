package com.example.lesson08_aop.service;

/**
 * Service that handles order operations.
 */
public class OrderService {

    /**
     * Places an order with the given order ID.
     * @param orderId the ID of the order to place
     */
    public void placeOrder(String orderId) {

        System.out.println("Xử lý đơn hàng: " + orderId);
    }

    /**
     * Cancels an order with the given order ID.
     * @param orderId the ID of the order to cancel
     */
    public void cancelOrder(String orderId) {

        System.out.println("Hủy đơn hàng: " + orderId);
    }
}
