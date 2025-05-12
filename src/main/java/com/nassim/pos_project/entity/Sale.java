package com.nassim.pos_project.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Sale {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime saleDate;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Payment payment;

    @ManyToMany
    @JoinTable(
            name = "sale_products",
            joinColumns = @JoinColumn(name = "sale_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    // Constructors
    public Sale() {}

    public Sale(LocalDateTime saleDate, Customer customer, Payment payment, List<Product> products) {
        this.saleDate = saleDate;
        this.customer = customer;
        this.payment = payment;
        this.products = products;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
