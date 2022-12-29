package com.example.headfirstdesignpatterns.domain.hometheaterfacade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        log.info(description + " going up");
    }

    public void down() {
        log.info(description + " going down");
    }


    public String toString() {
        return description;
    }
}
