package com.fkjava;

import java.io.File;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 11:35
 */
public class FilenameFilterTest {
    public static void main(String[] args) {
        File file = new File(".");
        String[] nameList = file.list(((dir, name) -> name.endsWith(".java") || new File(name).isDirectory()));
        for (String name : nameList){
            System.out.println(name);
        }
    }
}
