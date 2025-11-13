package com.ankitsingh.expensetracker.repository;

import com.ankitsingh.expensetracker.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {}
