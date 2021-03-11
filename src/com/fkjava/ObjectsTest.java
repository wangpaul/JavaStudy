package com.fkjava;

import java.util.Objects;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/11 07:53
 */
public class ObjectsTest {
    static ObjectsTest obj;

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        System.out.println(Objects.requireNonNull(obj, "obj参数不能是null"));
    }
}
