package com.example.pharmaoptservice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Entity // Обязательно: говорим Спрингу, что это таблица
@Table(name = "companies") // Имя таблицы в БД
@Data // Магия Lombok: создаст геттеры, сеттеры, toString, equals и hashCode
public class Company {

        @Id // Помечаем как Primary Key
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Настраиваем автоинкремент (IDENTITY для H2/Postgres)
        private Long id;

        @Column(unique = true, nullable = false, length = 100)
        private String login;

        @Column(name = "password_hash", nullable = false)
        private String passwordHash;

        @Column(unique = true, nullable = false, length = 12)
        private String inn;

        @Column(length = 9)
        private String kpp;

        @Column(name = "company_name", nullable = false)
        private String companyName;

        @Column(name = "company_address", nullable = false)
        private String companyAddress;
}
