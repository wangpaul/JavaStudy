package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/3 15:18
 */
public class Person {
    {
        int a = 6;
        if (a > 4)
        {
            System.out.println("Person初始化块：局部变量a的值大于4");
        }
    }
    {
        System.out.println("Person的第二个初始化块");
    }
    public Person()
    {
        System.out.println("Person类的无参数构造器");
    }

    public static void main(String[] args) {
        new Person1();
    }
}
