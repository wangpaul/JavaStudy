package com.fkjava;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/15 16:27
 */
public class PredicateTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("Java EE");
        books.add("疯狂Java");
        books.add("疯狂Android");

        System.out.println(calAll(books, ele->((String)ele).contains("疯狂")));
    }

    public static int calAll(Collection books, Predicate p){
        int total = 0;
        for (Object obj : books){
            if (p.test(obj)){
                total ++;
            }
        }
        return total;
    }
}
