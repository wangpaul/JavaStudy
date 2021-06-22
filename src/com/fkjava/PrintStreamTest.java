package com.fkjava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 13:04
 */
public class PrintStreamTest {
    public static void main(String[] args){
        try(
                FileOutputStream fos = new FileOutputStream("test.txt");
                PrintStream ps = new PrintStream(fos);
                )
        {
            ps.println("普通字符串");
            ps.println(new PrintStreamTest());
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
