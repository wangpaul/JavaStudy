package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/10 07:40
 */
public enum Gender implements GenderDesc{
    MALI("男"),FEMALE("女");
    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void info() {
        System.out.println("这是一个用于定义性别的枚举类");
    }
}
