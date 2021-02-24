package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/9 08:50
 */
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        pa.process(target, new PrintCommand());
        System.out.println("-----------------");
        pa.process(target, new AddCommad());
    }
}
