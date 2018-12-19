package com.lanou.c;

public class Zombie {
    private  int HP;
    private  int losHP;
    public final int NUMBRER = 12;

    public Zombie(){

    }
    public Zombie(int HP ,int losHP){
        this.HP = HP;
        this.losHP = losHP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getLosHP() {
        return losHP;
    }

    public void setLosHP(int losHP) {
        this.losHP = losHP;
    }

    public  void hitted(){
        if(HP < losHP){
            losHP = HP;
        }
        HP -= losHP;

        System.out.printf("失去%d血，剩余%d血\n",losHP,HP);
    }
    public  void die(){
        System.out.println("死亡");
    }
}
