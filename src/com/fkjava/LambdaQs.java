package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/9 17:23
 */
interface Eatable{
    void teste();
}

interface Flyable{
    void fly(String weather);
}

interface Addable{
    int add(int a, int b);
}

public class LambdaQs {
    public void eat(Eatable e){
        System.out.println(e);
        e.teste();
    }

    public void drive(Flyable f){
        System.out.println("我正在驾驶：" + f);
        f.fly("晴天");
    }

    public void test(Addable add){
        System.out.println("5+3=" + add.add(5,3));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        lq.eat(() -> System.out.println("苹果味道不错"));

        lq.drive(weather -> {
            System.out.println("今天天气是：" + weather);
            System.out.println("飞行平稳");
        });

        lq.test((a , b) -> a + b);
    }
}
