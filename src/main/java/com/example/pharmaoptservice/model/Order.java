package com.example.pharmaoptservice.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
public class Order {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @ManyToOne
     @JoinColumn (name = "company_id", nullable = false)
     private Company company;

     @Column(name = "order_date", nullable = false)
     private LocalDateTime orderDate = LocalDateTime.now();

     @Column(name = "status", nullable = false)
     private String status;  // 'NEW', 'PROCESSING', 'SHIPPED'
}
