package com.example.lesson02_configuration.service;

/**
 * Provides user-related operations using a database connection.
 */
public class UserService {

    private AppDatabase database;

    /**
     * Constructs a UserService with the given database.
     *
     * @param database the AppDatabase used for queries
     */
    public UserService(AppDatabase database) {
        this.database = database;
    }

    /**
     * Finds a user by name.
     * @param name the name of the user to find
     */
    public void findUser(String name) {
        database.connect();
        System.out.println("Tìm user: " + name);
    }

}
