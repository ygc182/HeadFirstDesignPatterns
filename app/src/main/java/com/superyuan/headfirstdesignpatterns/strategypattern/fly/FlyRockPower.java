package com.superyuan.headfirstdesignpatterns.strategypattern.fly;

public class FlyRockPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我拥有火箭功能飞");
    }
}
