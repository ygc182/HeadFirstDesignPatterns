package com.superyuan.headfirstdesignpatterns.strategypattern;

import com.superyuan.headfirstdesignpatterns.strategypattern.fly.FlyNoWay;

public class TestEntry {

    public static void main(String[] args) {
        BlackDuck blackDuck = new BlackDuck();
        blackDuck.swim();
        blackDuck.display();
        blackDuck.performFly();
        blackDuck.setFlyBehavior(new FlyNoWay());
        blackDuck.performFly();
        blackDuck.performQuack();

    }
}
