package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @package com.fkjava
 * @date 2021/3/9 08:55
 */
public class AddCommad implements Command{
    @Override
    public void process(int[] target) {
        int sum = 0;
        for (int tmp : target){
            sum += tmp;
        }
        System.out.println("数组元素的总和是：" + sum);
    }
}
