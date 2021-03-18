package com.fkjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/18 15:30
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();
        props.setProperty("username", "wzz");
        props.setProperty("password", "123456");
        props.store(new FileOutputStream("a.properties"), "comment line");

        Properties props2  = new Properties();
        props2.setProperty("gender", "male");
        props2.load(new FileInputStream("a.properties"));
        System.out.println(props2);
    }
}
