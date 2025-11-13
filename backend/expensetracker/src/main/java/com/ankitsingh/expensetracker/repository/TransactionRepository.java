package com.ankitsingh.expensetracker.repository;

import com.ankitsingh.expensetracker.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findByUserId(String userId);
}
