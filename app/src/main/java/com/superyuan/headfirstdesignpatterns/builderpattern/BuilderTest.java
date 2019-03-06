package com.superyuan.headfirstdesignpatterns.builderpattern;

public class BuilderTest {
    public static void main(String[] args) {
//        Product product = new ConcreteBuilder()
//                .buildCpu("i3")
//                .buildMainpad("wix")
//                .build();

        Product product = new Product.Builder()
                .setCpu("i3")
                .setMainpad("mix")
                .build();
        System.out.println(product.toString());

    }
}
