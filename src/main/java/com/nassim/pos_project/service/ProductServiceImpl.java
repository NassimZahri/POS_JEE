package com.nassim.pos_project.service;

import com.nassim.pos_project.dao.ProductRepository;
import com.nassim.pos_project.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    // ** C **
    @Override
    public Product addProduct(String name, double price, int quantity) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setStock(quantity);
        // Optionally set groupName and subGroup if needed
        return productRepository.save(product);
    }

    // ** R **
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    @Override
    public Product searchProductById(int id) {
        Optional<Product> product = productRepository.findById((Integer) id);
        return product.orElse(null);
    }

    // ** U **
    @Override
    public Product updateProduct(int productId, String name, double price, int quantity) {
        Optional<Product> optionalProduct = productRepository.findById((Integer) productId);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(name);
            product.setPrice(price);
            product.setStock(quantity);
            return productRepository.save(product);
        }
        return null;
    }

    // ** D **
    @Override
    public void deleteProduct(int productId) {
        productRepository.deleteById((Integer) productId);
    }
}