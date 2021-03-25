package com.fkjava;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/23 16:48
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>(
                new Comparator<Object>() {
                    @Override
                    public int compare(Object fst, Object snd){
                        return hashCode() > snd.hashCode() ? 1
                                : hashCode() < snd.hashCode() ? -1 : 0;
                    }
                }
        );
        ts1.add("hello");
        ts1.add("wa");

        TreeSet<String> ts2 = new TreeSet<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String first, String second){
                        return first.length() > second.length() ? -1
                                : first.length() < second.length() ? 1 : 0;
                    }
                }
        );
        ts2.add("hello");
        ts2.add("wa");
        System.out.println(ts1);
        System.out.println(ts2);
    }
}
