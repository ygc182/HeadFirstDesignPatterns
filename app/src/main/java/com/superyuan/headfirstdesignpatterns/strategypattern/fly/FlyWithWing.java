package com.superyuan.headfirstdesignpatterns.strategypattern.fly;

public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我会用翅膀飞");
    }
}
