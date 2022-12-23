package com.example.headfirstdesignpatterns.service;

import com.example.headfirstdesignpatterns.domain.adapter.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AviationService {


    public void getFlying() {
        Plane plane = new HunterPlane();

        Helicopter helicopter = new HunterHelicopter();
        Plane helicopterAdapter = new HelicopterAdapter(helicopter);

        log.info("The helicopter says...");
        helicopter.hover();
        helicopter.fly();

        log.info("The plane says...");
        playPlane(plane);

        log.info("The heli adapter says...");
        playPlane(helicopterAdapter);

    }

    private void playPlane(Plane plane) {
        plane.quack();
        plane.fly();
    }
}
