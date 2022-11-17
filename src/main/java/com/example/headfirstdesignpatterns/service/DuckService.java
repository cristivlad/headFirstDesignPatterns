package com.example.headfirstdesignpatterns.service;

import com.example.headfirstdesignpatterns.domain.client.Duck;
import com.example.headfirstdesignpatterns.domain.fly.FlyRocketPowered;
import com.example.headfirstdesignpatterns.domain.client.MallardDuck;
import com.example.headfirstdesignpatterns.domain.client.ModelDuck;
import org.springframework.stereotype.Service;

@Service
public class DuckService {
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
