package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/4/14 09:29
 */
public class ThreadExceptionTest implements Runnable {
    public void run(){
        firstMethod();
    }

    public void firstMethod(){
        secondMethod();
    }

    public void secondMethod(){
        int a = 5;
        int b = 0;
        int c = a / b;
    }

    public static void main(String[] args) {
        new Thread(new ThreadExceptionTest()).start();
    }
}
