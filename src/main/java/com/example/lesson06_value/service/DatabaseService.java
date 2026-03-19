package com.example.lesson06_value.service;

/**
 * Service that stores database configuration
 * and provides a simple connection representation.
 */
public class DatabaseService {

    private String url;
    private String username;

    /**
     * Creates a DatabaseService with connection information.
     * @param url database URL
     * @param username database username
     */
    public DatabaseService(String url, String username) {
        this.url = url;
        this.username = username;
    }

    /**
     * Simulates a database connection result.
     */
    public void connect() {

        System.out.println("Kết nối tới: " + url + " với user: " + username);
    }
}
