package com.example.headfirstdesignpatterns.dpbooks;

public class VehicleFactory {

    public enum VehicleType {
        BIKE, CAR, TRUCk;
    }

    public static Vehicle create(VehicleType type) {
        switch (type) {
            case CAR -> {
                return new Car("car");
            }
            case BIKE -> { return new Bike("bike");}
            case TRUCk -> {
                return new Truck("truck");
            }
            default -> {return null; }
        }
    }
}
