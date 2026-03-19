package com.example.lesson07_mini_project.model;

/**
 * Represents an order containing product information and price.
 */
public class Order {

    private final String orderId;
    private final String productName;
    private final double price;


    /**
     * Creates an Order with basic order details.
     * @param orderId unique identifier of the order
     * @param productName name of the product
     * @param price product price
     */
    public Order(String orderId, String productName, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.price = price;
    }

    /**
     * @return order ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @return product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @return product price
     */
    public double getPrice() {
        return price;
    }


}
