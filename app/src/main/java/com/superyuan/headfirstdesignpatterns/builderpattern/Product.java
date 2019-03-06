package com.superyuan.headfirstdesignpatterns.builderpattern;

/**
 * 产品
 */
public class Product {

    private String cpu;
    private String mainPad;

    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public void setMainPad(String mainPad){
        this.mainPad = mainPad;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cpu='" + cpu + '\'' +
                ", mainPad='" + mainPad + '\'' +
                '}';
    }


    public static class Builder{

        private String cpu;
        private String mainpad;

        public Builder(){}
        public Builder setCpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder setMainpad(String mainpad){
            this.mainpad = mainpad;
            return this;
        }

        private void applyConfig(Product product){
            product.setCpu(cpu);
            product.setMainPad(mainpad);
        }
        public Product build(){
            Product product = new Product();
            applyConfig(product);
            return product;
        }
    }
}
