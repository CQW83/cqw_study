package com.cqw.e;

public class Student extends Man {
    @Override
    public void eat() {
        System.out.println("男学生吃麻辣烫");
    }
    @Override
    public void like() {
        System.out.println("学生喜欢女老师");
    }
}
