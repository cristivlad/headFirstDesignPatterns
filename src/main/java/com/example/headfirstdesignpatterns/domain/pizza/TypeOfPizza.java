package com.example.headfirstdesignpatterns.domain.pizza;

public enum TypeOfPizza {
    CHEESE("cheese"), CLAM("clam"), PEPPERONI("pepperoni"), VEGGIE("veggie");
    private final String type;

    TypeOfPizza(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
