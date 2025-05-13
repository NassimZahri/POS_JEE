package com.nassim.pos_project.service;

import com.nassim.pos_project.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ProductService {

    // ** C **
    Product addProduct(String name, double price, int quantity);

    // ** R **
    List<Product> getAllProducts();
    Product searchProductById(int id);

    // ** U **
    Product updateProduct(int productId, String name, double price, int quantity);

    // ** D **
    void deleteProduct(int productId);
}
