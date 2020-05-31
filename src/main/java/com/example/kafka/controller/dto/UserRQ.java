package com.example.kafka.controller.dto;

public class UserRQ {

    /** The email. */
    private String email;

    /** The phone. */
    private String phone;

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /**
     * Instantiates a new user rq.
     */
    public UserRQ() {

    }

    /**
     * Instantiates a new user rq.
     *
     * @param email the email
     * @param firstName the first name
     * @param lastName the last name
     * @param phone the phone
     */
    public UserRQ(String email, String firstName, String lastName, String phone) {
        super();
        this.email = email;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }
}
