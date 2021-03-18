package com.fkjava;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/15 09:43
 */
public class CollectionEach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("Java EE");
        books.add("疯狂Java");
        books.add("疯狂Android");
        books.forEach(obj -> System.out.println("迭代集合：" + obj));
    }
}
