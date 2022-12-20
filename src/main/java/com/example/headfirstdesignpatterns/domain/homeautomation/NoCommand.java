package com.example.headfirstdesignpatterns.domain.homeautomation;

public class NoCommand implements Command {
    @Override
    public void execute() {
        // should be empty
    }

    @Override
    public void undo() {
        // should be empty
    }
}
