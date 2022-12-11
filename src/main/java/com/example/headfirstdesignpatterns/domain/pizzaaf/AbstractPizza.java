package com.example.headfirstdesignpatterns.domain.pizzaaf;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;
import java.util.Objects;

import static java.util.Objects.isNull;

@Slf4j
public abstract class AbstractPizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        log.info("Bake for 15 minutes at 350");
    }

    void cut() {
        log.info("Cutting the pizza into diagonal slices");
    }

    void box() {
        log.info("Place pizza in official AbstractPizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("----- " + name + " -----\n");
        if (!isNull(dough)) {
            result.append(dough + "\n");
        }
        if (!isNull(sauce)) {
            result.append(sauce + "\n");
        }
        if (!isNull(cheese)) {
            result.append(cheese + "\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length -1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (!isNull(clams)) {
            result.append(clams + "\n");
        }
        if (!isNull(pepperoni)) {
            result.append(pepperoni + "\n");
        }
        return result.toString();
    }
}
