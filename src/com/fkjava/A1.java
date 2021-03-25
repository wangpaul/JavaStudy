package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/23 15:21
 */
public class A1 extends Apple2<String> {
    @Override
    public String getInfo() {
        return "子类" + super.getInfo();
    }
}
