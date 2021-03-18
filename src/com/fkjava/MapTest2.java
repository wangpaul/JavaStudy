package com.fkjava;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/18 14:53
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Java", 109);
        map.put("ios", 10);
        map.put("Ajax", 79);
        map.replace("XML", 66);
        map.merge("ios", 20, (oldVal, param) -> (Integer)oldVal + (Integer)param);
        System.out.println(map);
        map.computeIfAbsent("Java", (key) -> ((String)key).length());
        System.out.println(map);
        map.computeIfPresent("Java", (key, value) -> (Integer)value * (Integer)value );
        System.out.println(map);
    }
}
