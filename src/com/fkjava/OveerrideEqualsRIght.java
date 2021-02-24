package com.fkjava;

import java.util.Objects;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/4 16:59
 */
class Person1 {
    private String name;
    private String idStr;

    public Person1() {
    }

    public Person1(String name, String idStr) {
        this.name = name;
        this.idStr = idStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person = (Person1) o;
        return Objects.equals(idStr, person.idStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, idStr);
    }
}
public class OveerrideEqualsRIght {
    public static void main(String[] args) {
        Person1 p1 = new Person1("wzz","12343433433");
        Person1 p2 = new Person1("cc","12343433433");
        Person1 p3 = new Person1("lh","99933433");
        System.out.println("p1和p2是否相等？" + p1.equals(p2));
        System.out.println("p1和p3是否相等？" + p1.equals(p3));

    }
}
