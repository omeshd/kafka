package com.example.kafka.domain.service;

import com.example.kafka.domain.User;

public interface UserManagementService {

    /**
     * Creates the user.
     *
     * @param user the user
     * @return the user
     */
    User createUser(User user);

    /**
     * Update user.
     *
     * @param user the user
     * @return the user
     */
    User updateUser(User user);

    /**
     * Retrieve user.
     *
     * @param id the id
     * @return the user
     */
    User retrieveUser(String id);

    /**
     * Retrieve user by email.
     *
     * @param email the email
     * @return the user
     */
    User retrieveUserByEmail(String email);
}
