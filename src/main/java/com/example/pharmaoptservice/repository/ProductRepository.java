package com.example.pharmaoptservice.repository;

import com.example.pharmaoptservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
