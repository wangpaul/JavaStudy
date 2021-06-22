package com.fkjava;

import java.io.*;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 13:38
 */
public class ReadObject {
    public static void main(String[] args) {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"))
        ) {
            Person2 p = (Person2)ois.readObject();
            System.out.println(p.getName() + p.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
