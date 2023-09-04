package com.cybersoft.baitap0509.entity;

public class Student {
    private String nameStudent;
    private int age;

    public Student(){

    }
    public Student(String nameStudent, int age) {
        this.nameStudent = nameStudent;
        this.age = age;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
