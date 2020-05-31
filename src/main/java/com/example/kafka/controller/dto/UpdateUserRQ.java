package com.example.kafka.controller.dto;

public class UpdateUserRQ {

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The profile pic. */
    private String profilePic;

    /**
     * Instantiates a new update user rq.
     */
    public UpdateUserRQ() {

    }

    /**
     * Instantiates a new update user rq.
     *
     * @param firstName the first name
     * @param lastName the last name
     * @param profilePic the profile pic
     *
     */
    public UpdateUserRQ(String firstName, String lastName, String profilePic) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePic = profilePic;
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

    /**
     * Gets the profile pic.
     *
     * @return the profile pic
     */
    public String getProfilePic() {
        return profilePic;
    }
}
