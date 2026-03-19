package com.example.lesson07_mini_project.service;

import com.example.lesson07_mini_project.model.Order;

/**
 * Service that applies discounts to orders.
 */
public class DiscountService {

    /**
     * Applies a 10% discount to the given order.
     * @param order order to apply discount
     */
    public void applyDiscount(Order order) {

        System.out.println("Áp dụng giảm giá 10% cho đơn hàng: " + order.getOrderId() + " - " +
                "Giá gốc: " + order.getPrice() + " - Giá sau giảm: " + order.getPrice() * 0.9);
    }
}
