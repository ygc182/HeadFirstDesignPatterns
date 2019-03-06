package com.superyuan.headfirstdesignpatterns.strategypattern.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
}
