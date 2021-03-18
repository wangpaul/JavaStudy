package com.fkjava;

import java.util.stream.IntStream;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/15 16:56
 */
public class IntStreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder().add(20).add(13).add(-2).add(18).build();
        System.out.println("最大值：" + is.max().getAsInt());
        System.out.println("是否所有元素的平方都大于20：" + is.anyMatch(ele -> ele * ele > 20));
    }
}
