package com.fkjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/15 09:38
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("wzz");
        c.add(6);
        System.out.println("c的个数：" + c.size());
        c.remove(6);
        System.out.println("c的个数：" + c.size());
        System.out.println("c是否包含wzz:" + c.contains("wzz"));
        c.add("Java EE");
        System.out.println("c集合的元素" + c);
        Collection books = new HashSet();
        books.add("Java EE");
        books.add("疯狂Java");
        System.out.println("c是否包含books：" + c.containsAll(books));
        c.removeAll(books);
        System.out.println("c集合的元素" + c);
        c.clear();
        System.out.println("c集合的元素" + c);
        books.removeAll(c);
        System.out.println("books集合的元素" + books);
    }
}
