package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/9 17:18
 */
public class CommandTest3 {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] array = {3, -4, 6, 4};
        pa.process(array, (int[] target)->{
            int sum = 0;
            for (int tmp : target){
                sum += tmp;
            }
            System.out.println("数组元素的总和是：" + sum);
        });
    }
}
