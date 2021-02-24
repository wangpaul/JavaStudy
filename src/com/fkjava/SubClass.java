package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/3 14:09
 */
class BaseClass{
    public int book = 6;
    public void base(){
        System.out.println("父类的普通方法");
    }
    public void test(){
        System.out.println("父类被覆盖的方法");
    }
}

public class SubClass extends BaseClass {
    public String book = "疯狂Java";

    @Override
    public void test() {
        System.out.println("子类覆盖父类的方法");
    }

    public void sub(){
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();

        System.out.println(bc.book);

        bc.base();
        bc.test();

        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();

        BaseClass ploymophicBc = new SubClass();
        System.out.println(ploymophicBc.book);
        ploymophicBc.base();
        ploymophicBc.test();
    }
}
