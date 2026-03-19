package com.example.lesson03_bean_practice.service;

/**
 * Provides user-related operations using email sender
 */
public class NotificationService {

    private final EmailSender emailSender;

    /**
     * Constructs a NotificationService with the given email sender
     * @param emailSender the EmailSender use for queries
     */
    public NotificationService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    /**
     * Notify the user by name and show message
     * @param username the name of the user to find and sent
     */
    public void notifyUser(String username) {

        System.out.println("Thông báo cho user: " + username);

        emailSender.sendEmail("Thanh", "Hello em yeu");

    }

}
