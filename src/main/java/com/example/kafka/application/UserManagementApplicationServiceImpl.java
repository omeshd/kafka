package com.example.kafka.application;

import com.example.kafka.common.LoggingEvent;
import com.example.kafka.common.LoggingEventField;
import com.example.kafka.common.LoggingUtil;
import com.example.kafka.controller.dto.*;
import com.example.kafka.domain.User;
import com.example.kafka.domain.UserType;
import com.example.kafka.domain.service.UserManagementService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserManagementApplicationServiceImpl implements UserManagementApplicationService {

    /** The logger. */
    private org.slf4j.Logger logger = LoggerFactory.getLogger(UserManagementApplicationServiceImpl.class);

    /** The user management service. */
    @Autowired
    private UserManagementService userManagementService;

    @Override
    public UserRS createUser(UserRQ userRQ, UserType userType) {

        Map<String, String> logMap = new HashMap<String, String>();
        logMap.put(LoggingEventField.USERNAME, userRQ.getEmail());
        logMap.put(LoggingEventField.PHONE, userRQ.getPhone());
        LoggingUtil.logInfo(logger, "Create user start.", logMap, LoggingEvent.CREATE_USER);

        /** validate email is already registered */
        LoggingUtil.logInfo(logger, "Validate email is not already registered.", logMap, LoggingEvent.CREATE_USER);
        User existingEmailUser = userManagementService.retrieveUserByEmail(userRQ.getEmail());
        Assert.isNull(existingEmailUser, "Email already registered to system");

        /** save new user */
        LoggingUtil.logInfo(logger, "Save new user.", logMap, LoggingEvent.CREATE_USER);
        User user = DtoToDomainTransformer.transformUserDtoToDomain(userRQ, userType);
        user = userManagementService.createUser(user);

        UserRS userRS = new UserRS(user.getId());
        return userRS;
    }

    @Override
    public void updateUser(UpdateUserRQ updateUserRQ, String userId) {

        Map<String, String> logMap = new HashMap<String, String>();
        logMap.put(LoggingEventField.USERNAME, updateUserRQ.getFirstName());
        logMap.put(LoggingEventField.PHONE, updateUserRQ.getLastName());
        LoggingUtil.logInfo(logger, "Create user start.", logMap, LoggingEvent.CREATE_USER);
    }

    @Override
    public UserProfileRS retrieveUserById(String userId) {
        return null;
    }
}
