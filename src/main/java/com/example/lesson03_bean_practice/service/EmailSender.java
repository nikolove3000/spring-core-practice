package com.example.lesson03_bean_practice.service;

/**
 * Sends emails via SMTP server.
 */
public class EmailSender {

    private final String host;
    private final int port;

    /**
     * Constructs an EmailSender with the given host and port.
     * @param host The email host name
     * @param port The email connection port
     */
    public EmailSender(String host, int port) {
        this.host = host;
        this.port = port;
    }

    /**
     * Send email to the right username and message
     * @param to The name of sent user
     * @param message The message for the send user
     */
    public void sendEmail(String to, String message) {

        System.out.println("Gửi email tới: " + to + " | Nội dung: " + message + " | Server: " + host + ":" + port);

    }
}
