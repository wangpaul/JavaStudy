package com.fkjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/16 14:04
 */
public class LIstTest {
    public static void main(String[] args) {
        List books = new ArrayList<>();
        books.add("Java EE");
        books.add("疯狂Java");
        books.add("疯狂Android");
        System.out.println(books);

        books.add(1, new String("疯狂Ajax"));
        for (int i = 0; i < books.size(); i++){
            System.out.println(books.get(i));
        }
        books.add(1, "疯狂音乐");
        System.out.println(books);
    }
}
