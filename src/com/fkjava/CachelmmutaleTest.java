package com.fkjava;

import java.util.Objects;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/8 11:00
 */
class Cachelmmutale {
    private static int MAX_SIZE = 10;
    private static Cachelmmutale[] cache = new Cachelmmutale[MAX_SIZE];
    private static int pos =0;
    private final String name;

    private Cachelmmutale(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Cachelmmutale valueOf(String name){
        for (int i = 0; i < MAX_SIZE; i++){
            if (cache[i] != null && cache[i].getName().equals(name)){
                return cache[i];
            }
        }

        if (pos == MAX_SIZE){
            cache[0] = new Cachelmmutale(name);
            pos = 1;
        }else{
            cache[pos++] = new Cachelmmutale(name);
        }
        return cache[pos - 1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cachelmmutale that = (Cachelmmutale) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class CachelmmutaleTest {
    public static void main(String[] args) {
        Cachelmmutale c1 = Cachelmmutale.valueOf("hello");
        Cachelmmutale c2 = Cachelmmutale.valueOf("hello");
        System.out.println(c1 == c2);
    }
}
