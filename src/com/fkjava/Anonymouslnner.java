package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/9 16:44
 */
abstract class Device{
    private String name;
    public abstract double getPrice();
    public Device(){}
    public Device(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Anonymouslnner {
    public void test (Device d){
        System.out.println("购买了一个" + d.getName() + "，花掉了" + d.getPrice());
    }

    public static void main(String[] args) {
        Anonymouslnner ai = new Anonymouslnner();
        ai.test(new Device() {
            @Override
            public double getPrice() {
                return 67.8;
            }
        });

        Device d =new Device(){
            {
                System.out.println("匿名内部类的初始化块...");
            }

            @Override
            public double getPrice() {
                return 56.2;
            }

            @Override
            public String getName() {
                return "键盘";
            }
        };
        ai.test(d);
    }
}
