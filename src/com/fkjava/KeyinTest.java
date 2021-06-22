package com.fkjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 13:12
 */
public class KeyinTest {
    public static void main(String[] args) {
        try (
                InputStreamReader reader = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(reader)
        ) {
            String line = null;
            while((line = br.readLine()) != null){
                if (line.equals("exit")) {
                    System.exit(1);

                }
                System.out.println("输入内容为：" + line);
            }
        }catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
