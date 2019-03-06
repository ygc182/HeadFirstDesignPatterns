package com.superyuan.headfirstdesignpatterns.strategypattern.quack;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我会吱吱叫");
    }
}
