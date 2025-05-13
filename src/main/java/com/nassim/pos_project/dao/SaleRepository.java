package com.nassim.pos_project.dao;

import com.nassim.pos_project.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    // Custom query methods can be defined here if needed
    // For example, find by customer name or date range
    // Sale findByCustomerName(String customerName);
    // List<Sale> findByDateBetween(Date startDate, Date endDate);
}
