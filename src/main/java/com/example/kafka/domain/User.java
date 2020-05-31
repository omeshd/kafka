package com.example.kafka.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "user")
public class User {

    /** The id. */
    @Id
    private String id;

    /** The email. */
    @Indexed
    private String email;

    /** The phone. */
    private String phone;

    /** The user type. */
    private UserType userType;

    /** The user profile. */
    private UserProfile userProfile;

    /** The created date. */
    private Date createdDate;

    /** The modified date. */
    private Date modifiedDate;

    /** The active. */
    private boolean active;

    /** The deleted. */
    private boolean deleted;

    /**
     * Instantiates a new user.
     */
    public User() {

    }

    /**
     * Instantiates a new user.
     *
     * @param email          the email
     * @param phone          the phone
     * @param userType       the user type
     * @param userProfile    the user profile
     */

    public User(String email, String phone, UserType userType, UserProfile userProfile) {
        super();
        this.email = email;
        this.phone = phone;
        this.userType = userType;
        this.userProfile = userProfile;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
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
     * Gets the user profile.
     *
     * @return the user profile
     */
    public UserProfile getUserProfile() {
        return userProfile;
    }

    /**
     * Gets the user type.
     *
     * @return the user type
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * Gets the created date.
     *
     * @return the created date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Gets the modified date.
     *
     * @return the modified date
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Checks if is active.
     *
     * @return true, if is active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Checks if is deleted.
     *
     * @return true, if is deleted
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the active.
     *
     * @param active the new active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Sets the deleted.
     *
     * @param deleted the new deleted
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Sets the created date.
     *
     * @param createdDate the new created date
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Sets the modified date.
     *
     * @param modifiedDate the new modified date
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
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
     * Sets the phone.
     *
     * @param phone the new phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Sets the user profile.
     *
     * @param userProfile the new user profile
     */
    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    /**
     * Sets the user type.
     *
     * @param userType the new user type
     */
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    /**
     * Checks if is registered user.
     *
     * @return true, if is registered user
     */
    public boolean isEnrolledUser() {
        return UserType.ENROLLED.equals(userType);
    }
}
