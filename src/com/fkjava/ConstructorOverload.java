package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/3 08:58
 */
public class ConstructorOverload {
    public String name;
    public int count;

    public ConstructorOverload() {
    }

    public ConstructorOverload(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        ConstructorOverload oc1 = new ConstructorOverload();
        ConstructorOverload oc2 = new ConstructorOverload("疯狂Java", 300000);

        System.out.println(oc1.name + " " + oc1.count);
        System.out.println(oc2.name + " " + oc2.count);
    }
}
