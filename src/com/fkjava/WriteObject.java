package com.fkjava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 13:34
 */
public class WriteObject {
    public static void main(String[] args) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"))
        ) {
          Person2 per = new Person2("wzz", 41);
          oos.writeObject(per);
        }  catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
