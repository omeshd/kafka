package com.example.kafka.application;

import com.example.kafka.controller.dto.UpdateUserRQ;
import com.example.kafka.controller.dto.UserProfileRS;
import com.example.kafka.controller.dto.UserRQ;
import com.example.kafka.controller.dto.UserRS;
import com.example.kafka.domain.UserType;

public interface UserManagementApplicationService {

    /**
     * Creates the user.
     *
     * @param userRQ   				the user rq
     * @param userType 				the user type
     * @return 						the user rs
     */
    UserRS createUser(UserRQ userRQ, UserType userType);

    /**
     * Update user.
     *
     * @param updateUserRQ 			the update user rq
     * @param userId       			the user id
     */
    void updateUser(UpdateUserRQ updateUserRQ, String userId);

    /**
     * Retrieve user by id.
     *
     * @param userId 				the user id
     * @return 						the user profile rs
     */
    UserProfileRS retrieveUserById(String userId);
}
