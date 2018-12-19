package com.cqw.f;

public class Horse implements Cargo {
    @Override
    public void pullGoods() {
        System.out.println("马拉货");
    }

    @Override
    public void pullPeople() {
        System.out.println("马拉人");
    }
}
