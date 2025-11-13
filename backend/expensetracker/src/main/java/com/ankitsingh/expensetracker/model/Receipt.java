package com.ankitsingh.expensetracker.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "receipts")
public class Receipt {
    @Id
    private String id;
    private String transactionId;
    private String fileUrl; // cloud path
    private Instant uploadedAt;
}
