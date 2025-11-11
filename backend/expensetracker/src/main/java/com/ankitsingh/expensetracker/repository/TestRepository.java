package com.ankitsingh.expensetracker.repository;

import com.ankitsingh.expensetracker.model.TestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<TestEntity, String> {}

