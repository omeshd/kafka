package com.example.kafka.domain;

public class UserProfile {

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The profile pic. */
    private String profilePic;

    /**
     * Instantiates a new user profile.
     *
     * @param firstName the first name
     * @param lastName the last name
     * @param profilePic the profile pic
     */
    public UserProfile(String firstName, String lastName, String profilePic) {
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

    /**
     * Sets the first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
     * Sets the profile pic.
     *
     * @param profilePic the new profile pic
     */
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
