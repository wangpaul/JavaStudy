package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/8 15:57
 */
public class OutputFactory {
    public Output getOutput(){
        return new Printer();
    }

    public static void main(String[] args) {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.keyIn("JavaEE 企业应用");
        c.keyIn("疯狂Java");
        c.print();
    }
}
