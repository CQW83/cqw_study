package com.cqw.e;

public class Teacher extends Woman {
    @Override
    public void sleep() {
        System.out.println("女老师睡觉");
    }
    @Override
    public void eat() {
        System.out.println("女老师吃饭");
    }
}
