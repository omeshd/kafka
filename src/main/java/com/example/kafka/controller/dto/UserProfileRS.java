package com.example.kafka.controller.dto;

public class UserProfileRS {

    /** The id. */
    private String userId;

    /** The email. */
    private String email;

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The phone. */
    private String phone;

    /** The country code. */
    private String profilePic;


    /**
     * Gets the user id.
     *
     * @return the user id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the user id.
     *
     * @param userId the new user id
     */
    public void setUserId(String userId) {
        this.userId = userId;
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
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
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
     * Sets the first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * Sets the phone.
     *
     * @param phone the new phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the profile Pic.
     *
     * @return the profile Pic
     */
    public String getProfilePic() {
        return profilePic;
    }

    /**
     * Sets the profile Pic.
     *
     * @param profilePic the new profile Pic
     */
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
