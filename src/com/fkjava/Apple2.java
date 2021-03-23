package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/23 14:39
 */
public class Apple2<T> {
    private T info;
    public Apple2(){};

    public Apple2(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public static void main(String[] args) {
        Apple2<String> a1 = new Apple2<>("苹果");
        System.out.println(a1.getInfo());
        Apple2<Double> a2 = new Apple2<>(5.67);
        System.out.println(a2.getInfo());
    }
}
