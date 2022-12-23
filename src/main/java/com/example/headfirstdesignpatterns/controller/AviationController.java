package com.example.headfirstdesignpatterns.controller;

import com.example.headfirstdesignpatterns.service.AviationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AviationController {

    private final AviationService aviationService;

    @GetMapping("/adapter")
    public void getFlying() {
        aviationService.getFlying();
    }
}
