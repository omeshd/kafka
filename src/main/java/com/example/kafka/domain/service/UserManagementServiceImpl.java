package com.example.kafka.domain.service;

import com.example.kafka.domain.User;
import com.example.kafka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserManagementServiceImpl implements UserManagementService {

    /** The user repository. */
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {

        Date createdDate = new Date();
        user.setCreatedDate(createdDate);
        user.setModifiedDate(createdDate);
        user.setActive(true);
        user.setDeleted(false);

        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {

        user.setModifiedDate(new Date());
        user = userRepository.save(user);
        return user;
    }

    @Override
    public User retrieveUser(String id) {
        return userRepository.findByIdAndDeleted(id, false);
    }

    @Override
    public User retrieveUserByEmail(String email) {
        return userRepository.findByEmailAndDeleted(email.toLowerCase(), false);
    }
}
