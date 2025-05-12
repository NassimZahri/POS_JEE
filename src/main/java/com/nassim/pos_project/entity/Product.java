package com.nassim.pos_project.entity;

import jakarta.persistence.*;

@Entity
public class Product {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String groupName;
    private String subGroup;
    private Double price;
    private Integer stock;

    // Constructors
    public Product() {}

    public Product(String name, String groupName, String subGroup, Double price, Integer stock) {
        this.name = name;
        this.groupName = groupName;
        this.subGroup = subGroup;
        this.price = price;
        this.stock = stock;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(String subGroup) {
        this.subGroup = subGroup;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
