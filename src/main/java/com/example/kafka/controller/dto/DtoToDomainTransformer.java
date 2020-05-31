package com.example.kafka.controller.dto;

import com.example.kafka.domain.User;
import com.example.kafka.domain.UserProfile;
import com.example.kafka.domain.UserType;

public class DtoToDomainTransformer {

    public static User transformUserDtoToDomain(UserRQ userRQ, UserType userType) {

        if (userRQ == null)
            return null;

        UserProfile userProfile = new UserProfile(userRQ.getFirstName(), userRQ.getLastName(), "");
        User user = new User(userRQ.getEmail(), userRQ.getPhone(), userType, userProfile);

        return user;

    }
}
