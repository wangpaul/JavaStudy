package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/22 15:25
 */
public class Teacher implements java.io.Serializable {
    private String name;
    private Person2 student;

    public Teacher(String name, Person2 student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person2 getStudent() {
        return student;
    }

    public void setStudent(Person2 student) {
        this.student = student;
    }
}
