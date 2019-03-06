package com.superyuan.headfirstdesignpatterns.strategypattern.Base;

import com.superyuan.headfirstdesignpatterns.strategypattern.fly.FlyBehavior;
import com.superyuan.headfirstdesignpatterns.strategypattern.fly.FlyWithWing;
import com.superyuan.headfirstdesignpatterns.strategypattern.quack.Quack;
import com.superyuan.headfirstdesignpatterns.strategypattern.quack.QuackBehavior;

/**
 * 基类 鸭子
 */
public abstract class Duck {

    public Duck() {
        flyBehavior = new FlyWithWing(); // 默认会使用翅膀飞
        quackBehavior = new Quack(); // 默认会呱呱叫
    }

    public void swim() {
        System.out.println("我会游泳");
    }

    /**
     * 不同鸭子外形不同，由子类具体实现
     */
    public abstract void display();

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
