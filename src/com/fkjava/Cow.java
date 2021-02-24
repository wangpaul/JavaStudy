package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/9 09:11
 */
public class Cow {
    private double weight;

    public Cow() {
    }

    public Cow(double weight) {
        this.weight = weight;
    }

    private class CowLeg{
        private double length;
        private String color;

        public CowLeg() {
        }

        public CowLeg(double length, String color) {
            this.length = length;
            this.color = color;
        }

        public void info(){
            System.out.println("当前牛腿的颜色是：" + color + ", 高：" + length);
            System.out.println("本牛腿所在奶牛重：" + weight);
        }
    }

    public void test(){
        CowLeg c1 = new CowLeg(1.12, "黑白");
        c1.info();
    }

    public static void main(String[] args) {
        Cow cow = new Cow(378.9);
        cow.test();
    }
}
