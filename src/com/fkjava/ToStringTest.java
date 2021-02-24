package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/4 10:22
 */
class Apple{
    private String color;
    private Double weight;
    public Apple(){}

    public Apple(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "一个苹果，颜色是：" + this.getColor() + "，重量是：" + this.getWeight();
    }
}

public class ToStringTest {
    public static void main(String[] args) {
        Apple a = new Apple("红色", 5.68);
        System.out.println(a);
    }
}
