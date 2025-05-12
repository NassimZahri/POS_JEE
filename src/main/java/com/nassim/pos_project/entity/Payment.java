package com.nassim.pos_project.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Payment {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardType;
    private String cardNumber;
    private LocalDate transactionDate;
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Constructors
    public Payment() {}

    public Payment(String cardType, String cardNumber, LocalDate transactionDate, Double amount, Customer customer) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.customer = customer;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
