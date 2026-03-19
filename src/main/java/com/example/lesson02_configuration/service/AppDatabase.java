package com.example.lesson02_configuration.service;

/**
 * Represents a database connection with url and credentials.
 */
public class AppDatabase {

    private String url;
    private String username;

    /**
     * Constructs an AppDatabase with the given url and username.
     * @param url      the database connection url
     * @param username the database username
     */
    public AppDatabase(String url, String username) {
        this.url = url;
        this.username = username;
    }

    /**
     * Connects to the database and prints connection info.
     */
    public void connect() {
        System.out.println("Kết nối tới: " + url + " với user: " + username);
    }
}
