package com.example.pharmaoptservice.repository;

import com.example.pharmaoptservice.model.Company;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

// Исправили порядок: сначала Сущность, потом тип её ID
public interface CompanyRepository extends JpaRepository<Company, Long> {

    // Добавляем этот метод, чтобы искать аптеку по логину при авторизации
    Optional<Company> findByLogin(String login);
}