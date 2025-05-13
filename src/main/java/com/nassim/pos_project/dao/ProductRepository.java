package com.nassim.pos_project.dao;

import com.nassim.pos_project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Custom query methods can be defined here if needed
    // For example, find by name or group name
//    Product findByName(String name);
//    Product findByGroupName(String groupName);
//    Product findBySubGroup(String subGroup);
}
