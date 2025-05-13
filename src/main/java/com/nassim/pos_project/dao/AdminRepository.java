package com.nassim.pos_project.dao;

import com.nassim.pos_project.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository <Admin, Long> {
    // Custom query methods can be defined here if needed
    // For example, find by username or email
    // Admin findByUsername(String username);
    // Admin findByEmail(String email);
    // List<Admin> findByRole(String role);
}
