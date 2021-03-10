package com.fkjava;

import java.util.Scanner;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/10 09:13
 */
public class ScannerkeyBoardTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        while (sc.hasNext()){
            System.out.println("键盘输入的内容是：" + sc.next());
        }
    }
}
