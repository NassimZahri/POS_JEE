package com.nassim.pos_project.dao;

import com.nassim.pos_project.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Custom query methods can be defined here if needed
    // For example, find by name or group name
    // Customer findByName(String name);
    // Customer findByGroupName(String groupName);
    // Customer findBySubGroup(String subGroup);
}
