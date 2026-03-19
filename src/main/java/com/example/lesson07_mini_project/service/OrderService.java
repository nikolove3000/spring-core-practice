package com.example.lesson07_mini_project.service;

import com.example.lesson07_mini_project.model.Order;

/**
 * Service that orchestrates order processing, including saving,
 * payment, discount application, and sending confirmation emails.
 */
public class OrderService {

    private final DatabaseService databaseService;
    private final PaymentService paymentService;
    private final EmailSender emailSender;
    private DiscountService discountService;

    /**
     * Creates an OrderService with the required services.
     * @param emailSender service to send confirmation emails
     * @param databaseService service to save orders
     * @param paymentService service to process payments
     */
    public OrderService(EmailSender emailSender, DatabaseService databaseService, PaymentService paymentService) {
        this.emailSender = emailSender;
        this.databaseService = databaseService;
        this.paymentService = paymentService;
    }

    /**
     * Sets the discount service (optional).
     *
     * @param discountService service to apply discounts
     */
    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    /**
     * Processes an order by saving it, processing payment,
     * applying discount if available, and sending confirmation email.
     * @param order order to process
     */
    public void placeOrder(Order order) {

        databaseService.saveOrder(order);
        paymentService.processPayment(order);
        if (discountService != null) discountService.applyDiscount(order);
        emailSender.sendConfirmation(order);
    }

}
