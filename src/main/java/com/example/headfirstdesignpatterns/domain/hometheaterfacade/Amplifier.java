package com.example.headfirstdesignpatterns.domain.hometheaterfacade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Amplifier {
    private String description;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        log.info(description + " on!");
    }

    public void off() {
        log.info(description + " off!");
    }

    public void setStereoSound() {
        log.info(description + " stereo mode on!");
    }

    public void setSurroundSound() {
        log.info(description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        log.info(description + " setting volume to " + level);
    }

    public void setTuner(Tuner tuner) {
        log.info(description + " setting tuner to " + tuner);
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        log.info(description + " setting Streaming Player to " + player);
    }

    public String toString() {
        return description;
    }
}
