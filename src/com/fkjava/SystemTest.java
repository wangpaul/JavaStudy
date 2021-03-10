package com.fkjava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/10 10:25
 */
public class SystemTest {
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        for (String name : env.keySet()){
            System.out.println(name + " ---> " + env.get(name));
        }

        System.out.println(System.getenv("JAVA_HOME"));
        Properties props = System.getProperties();
        try {
            props.store(new FileOutputStream("props.txt"), "System Properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(System.getProperty("os.name"));
    }
}
