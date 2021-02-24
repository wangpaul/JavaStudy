package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/8 16:07
 */
interface Product{
    int getProduceTime();
}
public class Printer implements Output, Product{
    private String[] printData = new String[MAX_CACHE_LINE];

    private int dataNum = 0;

    @Override
    public void out() {
        while (dataNum >0){
            System.out.println("打印机打印：" + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum >= MAX_CACHE_LINE){
            System.out.println("输出队列野蛮， 添加失败");
        }else{
            printData[dataNum++] = msg;
        }
    }

    @Override
    public int getProduceTime() {
        return 45;
    }

    public static void main(String[] args) {
        Output o = new Printer();
        o.getData("JavaEE企业应用");
        o.getData("疯狂Java");
        o.out();
        o.getData("疯狂Android");
        o.getData("疯狂Ajax");
        o.out();
        o.print("wzzz", "cc", "tc");
        o.test();
        Product p = new Printer();
        System.out.println(p.getProduceTime());
    }
}
