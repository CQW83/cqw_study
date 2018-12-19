package com.cqw.c;

public abstract class Athlete {
    private  String name;
    private int age;
    public Athlete(){

    }

    public Athlete(String name){
        this.name=name;
    }

    public Athlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void train();

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
