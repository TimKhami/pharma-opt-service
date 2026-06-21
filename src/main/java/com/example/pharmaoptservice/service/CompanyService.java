package com.example.pharmaoptservice.service;

import com.example.pharmaoptservice.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    // Final гарантирует, что репозиторий не изменится в процессе работы
    private final CompanyRepository companyRepository;

    // Внедряем зависимость через конструктор
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

//    public boolean authenticate(String login, String password) {
//        return ;
//    }
}
