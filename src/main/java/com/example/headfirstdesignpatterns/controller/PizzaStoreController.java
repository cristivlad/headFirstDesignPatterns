package com.example.headfirstdesignpatterns.controller;

import com.example.headfirstdesignpatterns.service.PizzaStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
public class PizzaStoreController {

    private final PizzaStoreService pizzaStoreService;

    @GetMapping("/getPizza")
    public ResponseEntity<Void> getPizza() {
        pizzaStoreService.getPizza();
        return new ResponseEntity<>(OK);
    }

    @GetMapping("/abstract-pizza")
    public ResponseEntity<Void> getAbstractPizza() {
        pizzaStoreService.getAbstractPizza();
        return new ResponseEntity<>(OK);
    }
}
