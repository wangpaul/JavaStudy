package com.fkjava;

import java.util.Objects;
import java.util.TreeMap;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/23 10:08
 */

class R implements Comparable{
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R{" +
                "count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != R.class) return false;
        R r = (R) o;
        return count == r.count;
    }

    @Override
    public int compareTo(Object o) {
        R r = (R)o;
        return count > r.count ? 1 : count < r.count ? -1 : 0;
    }
}
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(new R(3), "轻量级Java EE");
        tm.put(new R(-5), "疯狂Java");
        tm.put(new R(9), "疯狂Android");
        System.out.println(tm);

        System.out.println(tm.firstEntry());
        System.out.println(tm.lastKey());
        System.out.println(tm.higherKey(new R(2)));
        System.out.println(tm.lowerEntry(new R(2)));
        System.out.println(tm.subMap(new R(-1), new R(4)));
    }
}
