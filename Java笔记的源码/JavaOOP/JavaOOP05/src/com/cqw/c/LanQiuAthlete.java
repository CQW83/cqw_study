package com.cqw.c;

public class LanQiuAthlete extends Athlete {
    public LanQiuAthlete() {
    }

    public LanQiuAthlete(String name) {
        super(name);
    }

    @Override
    public void train(){
        System.out.println("篮球运动员在训练");
    }

}
