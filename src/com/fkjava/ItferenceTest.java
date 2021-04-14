package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/25 16:37
 */
class MyUtil<E> {
    public static <Z> MyUtil<Z> nil(){
        return null;
    }

    public static <Z> MyUtil<Z> cons(Z head, MyUtils<Z> tail) {
        return null;
    }


    E head(){
        return null;
    }
}
public class ItferenceTest {
    public static void main(String[] args) {
        MyUtil<String> ls = MyUtil.nil();
       // MyUtil.cons(42, MyUtil.nil());
    }

}
