package com.superyuan.headfirstdesignpatterns.strategypattern;

import com.superyuan.headfirstdesignpatterns.strategypattern.Base.Duck;

public class BlackDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我是黑色的鸭子");
    }
}
