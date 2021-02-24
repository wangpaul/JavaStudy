package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/9 08:53
 */
public class PrintCommand implements  Command{
    @Override
    public void process(int[] target) {
        for (int tmp : target){
            System.out.println("迭代输出目标数组的元素：" + tmp);
        }
    }
}
