package com.example.headfirstdesignpatterns.service;

import com.example.headfirstdesignpatterns.domain.homeautomation.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class HomeAutomationService {
    public void getSimpleRemoteInfo() {
        SimpleRemoteControl simpleRemote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        simpleRemote.setSlot(lightOn);
        simpleRemote.buttonWasPressed();
        simpleRemote.setSlot(garageOpen);
        simpleRemote.buttonWasPressed();
    }

    public void getRemoteInfo() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCd, stereoOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);

        log.info(String.valueOf(remoteControl));

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
    }

    public void getRemoteInfoLambda() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, livingRoomCeilingFan::high, livingRoomCeilingFan::off);

        Command stereoOnWithCd = () -> { stereo.on(); stereo.setCd(); stereo.setVolume(11);};
        remoteControl.setCommand(3, stereoOnWithCd, stereo::off);
        remoteControl.setCommand(4, garageDoor::up, garageDoor::down);

        log.info(String.valueOf(remoteControl));

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
    }
}
