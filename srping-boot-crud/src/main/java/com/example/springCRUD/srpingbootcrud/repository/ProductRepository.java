package com.example.springCRUD.srpingbootcrud.repository;

import com.example.springCRUD.srpingbootcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
