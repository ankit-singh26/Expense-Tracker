package com.ankitsingh.expensetracker.controller;
import com.ankitsingh.expensetracker.model.TestEntity;
import com.ankitsingh.expensetracker.repository.TestRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {
    private final TestRepository repo;

    public TestController(TestRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<TestEntity> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public TestEntity create(@RequestBody TestEntity t) {
        return repo.save(t);
    }
}
