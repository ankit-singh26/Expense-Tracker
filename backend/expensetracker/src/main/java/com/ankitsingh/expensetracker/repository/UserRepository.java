package com.ankitsingh.expensetracker.repository;
import com.ankitsingh.expensetracker.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
