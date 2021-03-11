package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/3/11 07:41
 */
class Address2 {
    String detail;

    public Address2(String detail) {
        this.detail = detail;
    }
}

class User implements Cloneable{
    int age;
    Address2 address;

    public User(int age) {
        this.age = age;
        address = new Address2("成都温江");
    }

    public void setAddress(Address2 address) {
        this.address = address;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args)  throws CloneNotSupportedException{
        User u1 = new User(41);
        User u2 = u1.clone();
        System.out.println(u1 == u2);
        System.out.println(u1.address == u2.address);
        u1.setAddress(new Address2("成都高新区"));
        System.out.println(u1.address == u2.address);
    }
}
