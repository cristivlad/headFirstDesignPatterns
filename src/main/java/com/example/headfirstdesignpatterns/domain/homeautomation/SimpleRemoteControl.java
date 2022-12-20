package com.example.headfirstdesignpatterns.domain.homeautomation;

public class SimpleRemoteControl {
    Command slot;

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
