package com.example.headfirstdesignpatterns.controller;

import com.example.headfirstdesignpatterns.service.StarbuzzService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
public class StarbuzzController {

    private final StarbuzzService starbuzzService;

    @GetMapping("/getCoffee")
    public ResponseEntity<Void> getCoffee() {
        starbuzzService.getCoffee();
        return new ResponseEntity<>(OK);
    }
}
