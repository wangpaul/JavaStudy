package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/9 16:24
 */
interface Product1{
    public double getPrice();
    public String getName();
}
public class AnonymousTest {
    public void test(Product1 p){
        System.out.println("购买了一个" + p.getName() + "，花掉了" + p.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest ta = new AnonymousTest();
        ta.test(new Product1() {
               public double getPrice() {
                return 567.8;
            }
            public String getName(){
                return "AGP显卡";
            }
        });
    }
}
