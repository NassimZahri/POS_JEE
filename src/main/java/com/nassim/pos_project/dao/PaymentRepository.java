package com.nassim.pos_project.dao;

import com.nassim.pos_project.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Additional query methods can be defined here if needed
    // For example, find by payment method or date range
    // Payment findByPaymentMethod(String paymentMethod);
    // List<Payment> findByDateBetween(Date startDate, Date endDate);
    // List<Payment> findByCustomerId(Long customerId);
    // List<Payment> findBySaleId(Long saleId);
    // List<Payment> findByAmountBetween(Double minAmount, Double maxAmount);
    // List<Payment> findByStatus(String status);
    // List<Payment> findByTransactionId(String transactionId);
}
