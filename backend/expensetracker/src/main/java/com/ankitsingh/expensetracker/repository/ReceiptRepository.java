package com.ankitsingh.expensetracker.repository;
import com.ankitsingh.expensetracker.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface ReceiptRepository extends MongoRepository<Receipt, String> {
    List<Receipt> findByTransactionId(String transactionId);
}
