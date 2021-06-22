package com.fkjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 15:28
 */
public class ReadTeacher {
    public static void main(String[] args) {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teacher.txt"))
        ) {
            Teacher t1 = (Teacher)ois.readObject();
            Teacher t2 = (Teacher)ois.readObject();
            Person2 p = (Person2)ois.readObject();
            Teacher t3 = (Teacher)ois.readObject();
            System.out.println(t2 == t3);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
