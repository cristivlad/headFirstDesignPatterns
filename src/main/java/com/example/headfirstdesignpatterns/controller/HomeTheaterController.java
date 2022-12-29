package com.example.headfirstdesignpatterns.controller;

import com.example.headfirstdesignpatterns.service.HomeTheaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeTheaterController {
    private final HomeTheaterService homeTheaterService;

    @GetMapping("/facade")
    public void getHomeTheaterFacade() {
        homeTheaterService.getHomeTheaterFacade();
    }

}
