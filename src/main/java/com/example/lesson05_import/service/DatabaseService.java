package com.example.lesson05_import.service;

/**
 * Represents a database service with url.
 */
public class DatabaseService {

    private final String url;

    /**
     * Constructs a DatabaseService with the given url.
     * @param url the database url
     */
    public DatabaseService(String url) {
        this.url = url;
    }

    /**
     * Returns the database url.
     * @return the database connection url
     */
    public String getUrl() {
        return url;
    }

}
