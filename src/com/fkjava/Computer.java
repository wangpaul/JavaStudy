package com.fkjava;


import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/8 15:48
 */
public class Computer {
    private Output out;

    public Computer(Output out) {
        this.out = out;
    }

    public void keyIn(String msg){
        out.getData(msg);
    }

    public void print(){
        out.out();
    }
}
