package com.superyuan.headfirstdesignpatterns.builderpattern;

/**
 * 具体建造者，一个或多个，不同需求不同具体建造者
 */
public class ConcreteBuilder extends Builder {

    Product product = new Product();


    @Override
    public Builder buildCpu(String cpu) {
        product.setCpu(cpu);
        return this;
    }

    @Override
    public Builder buildMainpad(String mainpad) {
        product.setMainPad(mainpad);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
