package com.ankitsingh.expensetracker.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "budgets")
public class Budget {
    @Id
    private String id;
    private String userId;
    private Double limitAmount;
    private String month; // e.g. "2025-11"
}

