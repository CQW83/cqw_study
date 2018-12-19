package com.cqw.f;

public class Airplane  implements  Fly,Cargo{
    @Override
    public void fly() {
        System.out.println("飞机飞！");
    }

    @Override
    public void pullGoods() {
        System.out.println("飞机拉货");
    }

    @Override
    public void pullPeople() {
        System.out.println("飞机拉人");
    }
}
