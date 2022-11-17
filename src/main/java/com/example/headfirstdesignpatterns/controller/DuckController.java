package com.example.headfirstdesignpatterns.controller;

import com.example.headfirstdesignpatterns.service.DuckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DuckController {

    private final DuckService duckService;

    @GetMapping("/duck")
    public ResponseEntity<Void> getDuck() {
        duckService.getDuck();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
