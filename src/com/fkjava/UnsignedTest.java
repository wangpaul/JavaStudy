package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/4 10:13
 * 以byte为例吧，Java规定的范围是-128~127，但如果你把它看做无符号数，范围就是0~255了。
 * 很明显 -128 < 127，但当做无符号数来比较，-128(会当成128)就大于127了。
 *
 */
public class UnsignedTest {
    public static void main(String[] args) {
        byte b = -3;

        System.out.println("tyte类型的-3对应的无符号整数：" + Byte.toUnsignedInt(b));

        int val = Integer.parseUnsignedInt("ab", 16);
        System.out.println(val);

        System.out.println(Integer.toUnsignedString(-12, 16));
        System.out.println(Integer.divideUnsigned(-2, 3));
        System.out.println(Integer.remainderUnsigned(-2,7));
    }
}
