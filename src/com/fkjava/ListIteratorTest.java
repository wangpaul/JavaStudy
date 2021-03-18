package com.fkjava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/16 14:23
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        String[] books = {
                "疯狂Java",
                "疯狂Adroid",
                "疯狂IOS"
        };

        List bookList = new ArrayList<>();

        for (int i = 0; i < books.length; i++){
            bookList.add(books[i]);
        }

        ListIterator lit = bookList.listIterator();

        while(lit.hasNext()){
            System.out.println(lit.next());
            lit.add("------------分隔符--------");
        }

        System.out.println("======反向迭代======");
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }                             
    }
}
