package com.example.headfirstdesignpatterns.service;

import com.example.headfirstdesignpatterns.domain.homeautomation.*;
import org.springframework.stereotype.Service;

@Service
public class HomeAutomationService {
    public void getRemoteInfo() {
        SimpleRemoteControl simpleRemote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        simpleRemote.setSlot(lightOn);
        simpleRemote.buttonWasPressed();
        simpleRemote.setSlot(garageOpen);
        simpleRemote.buttonWasPressed();
    }
}
