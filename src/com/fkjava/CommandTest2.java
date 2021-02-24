package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/9 17:16
 */
public class CommandTest2 {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        pa.process(target, new Command() {
            @Override
            public void process(int[] target) {
                int sum = 0;
                for (int tmp: target){
                    sum+= tmp;
                }
                System.out.println("数组元素的总和是：" + sum);
            }
        });
    }
}
