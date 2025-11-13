package com.ankitsingh.expensetracker.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String userId;
    private String categoryId;
    private Double amount;
    private String description;
    private Instant date;
    private String type; // "INCOME" or "EXPENSE"
}

