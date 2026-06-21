package com.example.pharmaoptservice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Уникальный код товара в учетной системе вашего оптового склада (например, "СК-001234")
    @Column(name = "warehouse_code", unique = true, nullable = false, length = 50)
    private String warehouseCode;

    //Название продукта
    @Column(nullable = false)
    private String name;

    //Производитель продукта
    @Column(nullable = false)
    private String producer;

    //Страна производства продукта
    @Column(nullable = false, length = 100)
    private String country;
}
