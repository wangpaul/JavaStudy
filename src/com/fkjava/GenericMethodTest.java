package com.fkjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/24 07:55
 */
public class GenericMethodTest {
    static <T> void formArrayToCollection(T[] a, Collection<T> c){
        for (T o : a){
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] oa = new Collection[100];
        Collection<Object> co = new ArrayList<>();
        formArrayToCollection(oa, co);
        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<>();
        formArrayToCollection(sa, cs);
    }
}
