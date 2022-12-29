package com.example.headfirstdesignpatterns.domain.hometheaterfacade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PopcornPopper {
    private String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        log.info(description + " on");
    }

    public void off() {
        log.info(description + " off");
    }

    public void pop() {
        log.info(description + " popping popcorn!");
    }


    public String toString() {
        return description;
    }
}
