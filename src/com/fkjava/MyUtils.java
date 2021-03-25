package com.fkjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/23 16:06
 */
public class MyUtils<Z> {
    public static <T> T copy(Collection<? super T> dest, Collection<T> src){
        T last = null;
        for(T ele : src){
            last = ele;
            dest.add(ele);
        }
        return last;
    }

    public static void main(String[] args) {
        List<Number> ln = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add(5);
        Integer last = copy(ln, li);
        System.out.println(ln);

    }
}
