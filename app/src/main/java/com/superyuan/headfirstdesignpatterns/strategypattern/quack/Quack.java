package com.superyuan.headfirstdesignpatterns.strategypattern.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}
