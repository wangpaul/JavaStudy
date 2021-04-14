package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/25 15:55
 */
class Foo{
    public <T> Foo(T t) {
        System.out.println(t);
    }
}
public class GenericConstructor {
    public static void main(String[] args) {
        new Foo("疯狂Java");
        new Foo(200);
        new <String> Foo("疯狂Android");

    }
}
