package com.example.kafka.repository;

import com.example.kafka.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    /**
     * Find by email and deleted.
     *
     * @param email 	the email
     * @param deleted 	the deleted
     * @return user		the user
     */
    public User findByEmailAndDeleted(String email, boolean deleted);

    /**
     * Find by id and deleted.
     *
     * @param id 		the id
     * @param deleted 	the deleted
     * @return user		the user
     */
    public User findByIdAndDeleted(String id, boolean deleted);
}
