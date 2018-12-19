package com.cqw.c;

public class ZuQiuAthlete extends Athlete {
    public ZuQiuAthlete() {
    }

    public ZuQiuAthlete(String name) {
        super(name);
    }

    @Override
    public void train(){
        System.out.println("足球运动员在训练");
    }
}
