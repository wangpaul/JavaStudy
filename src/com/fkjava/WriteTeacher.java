package com.fkjava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 15:26
 */
public class WriteTeacher {
    public static void main(String[] args) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"))
        ) {
            Person2 per = new Person2("wzz", 41);
            Teacher t1 = new Teacher("cc", per);
            Teacher t2 = new Teacher("lh", per);
            oos.writeObject(t1);
            oos.writeObject(t2);
            oos.writeObject(per);
            oos.writeObject(t2);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
