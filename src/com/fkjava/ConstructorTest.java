package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/3 08:37
 */
public class ConstructorTest {
    public String name;
    public int count;

    public ConstructorTest(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        ConstructorTest tc = new ConstructorTest("疯狂java讲义", 90000);
        System.out.println(tc.name);
        System.out.println(tc.count);
    }
}
