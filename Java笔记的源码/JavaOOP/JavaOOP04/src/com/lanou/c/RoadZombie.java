package com.lanou.c;

public class RoadZombie extends Zombie {
    private String equipment;
    private  int point;
    public RoadZombie(){
        //super用于调用父类的属性和方法
        //super():调用父类的无参构造方法,必须出现在构造方法的第一行

    }
    public RoadZombie( int HP,int losHP ,String equipment ){
        super(HP,losHP);
//      this.HP= HP;
//      this.losHP = losHP;
        this.equipment = equipment;
        point = HP/2;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
    public void losEquipment(){
        System.out.println("失去装备：" + equipment);
        equipment = null;
        setLosHP(getLosHP() * 2);
    }

    //不完全重写：在父类的基础上增加新的功能
    @Override
    public void hitted() {
        super.hitted();
        //判断
        if(equipment !=null && getHP() <= point){
            losEquipment();
        }

    }
  /*  //完全重写：子类重写这个方法，不使用父类的代码
    @Override
    public void hitted() {
    }
    */
}
