package com.example.headfirstdesignpatterns.controller;

import com.example.headfirstdesignpatterns.service.HomeAutomationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeAutomationController {

    private final HomeAutomationService service;

    @GetMapping("/remote")
    public void getRemoteInfo() {
        service.getRemoteInfo();
    }
}
