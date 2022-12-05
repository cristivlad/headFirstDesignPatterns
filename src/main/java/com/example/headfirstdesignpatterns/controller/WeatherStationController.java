package com.example.headfirstdesignpatterns.controller;

import com.example.headfirstdesignpatterns.service.WeatherStationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherStationController {

    private final WeatherStationService weatherStationService;

    @GetMapping("/getWeatherData")
    public ResponseEntity<Void> getWeatherData() {
        weatherStationService.getWeatherData();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
