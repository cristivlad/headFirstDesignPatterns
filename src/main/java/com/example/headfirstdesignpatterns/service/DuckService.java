package com.example.headfirstdesignpatterns.service;

import com.example.headfirstdesignpatterns.domain.ducks.client.Duck;
import com.example.headfirstdesignpatterns.domain.ducks.fly.fly.FlyRocketPowered;
import com.example.headfirstdesignpatterns.domain.ducks.client.MallardDuck;
import com.example.headfirstdesignpatterns.domain.ducks.client.ModelDuck;
import org.springframework.stereotype.Service;

@Service
public class DuckService {

    /**
     * Strategy pattern
     */
    public void getDuck() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
