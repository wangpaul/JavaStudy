package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/3 15:58
 */
class Root
{
    static {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root()
    {
        System.out.println("Root的无参数构造器");
    }
}

class Mid extends Root
{
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid()
    {
        System.out.println("Mid的无参数构造器");
    }
    public Mid(String msg)
    {
        this();
        System.out.println("Mid的带参数构造器，其参数：" + msg);
    }
}

class Leaf extends Mid
{
    static {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf()
    {
        super("疯狂Java");
        System.out.println("Leaf的无参数构造器");
    }
}

public class Test {
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}
