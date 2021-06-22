package com.fkjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 13:27
 */
public class ReadFromPrecess {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("javac");
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()))
        ) {
            String buff = null;
            while ((buff = br.readLine()) != null) {
                System.out.println(buff);
            }
        }
    }
}
