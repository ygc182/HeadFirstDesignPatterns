package com.superyuan.headfirstdesignpatterns.builderpattern;

/**
 *  抽象建造者
 */
public abstract class Builder {

    public abstract Builder buildCpu(String cpu);

    public abstract Builder buildMainpad(String mainpad);

    public abstract Product build();

}
