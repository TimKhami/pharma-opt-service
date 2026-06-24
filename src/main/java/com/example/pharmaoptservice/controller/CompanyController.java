package com.example.pharmaoptservice.controller;

import com.example.pharmaoptservice.dto.LoginRequest;
import com.example.pharmaoptservice.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CompanyController {

    private final CompanyService companyService;

    // Внедрение зависимости через конструктор (Spring Boot 4 рекомендует именно этот способ)
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        boolean isAuthenticated = companyService.authenticate(
                loginRequest.getLogin(),
                loginRequest.getPassword()
        );

        if (isAuthenticated) {
            return ResponseEntity.ok("Аутентификация прошла успешно.");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Неверный логин или пароль.");
        }
    }
}
