package com.ankitsingh.expensetracker.repository;

import com.ankitsingh.expensetracker.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface BudgetRepository extends MongoRepository<Budget, String> {
    List<Budget> findByUserId(String userId);
}
