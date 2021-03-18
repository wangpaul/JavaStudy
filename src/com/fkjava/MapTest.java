package com.fkjava;


import java.util.HashMap;
import java.util.Map;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/18 11:38
 */
public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("Java", 109);
        map.put("ios", 10);
        map.put("Ajax", 79);

        map.put("JavaEE", 99);
        System.out.println(map.put("ios", 99));
        System.out.println(map);

        System.out.println("是否包括ios:" + map.containsKey("ios"));

        System.out.println("是否包含99:" + map.containsValue(99));

        for (Object key : map.keySet()){
            System.out.println(key + "-->" + map.get(key));
        }
        map.remove("Ajax");
        System.out.println(map);
    }
}
