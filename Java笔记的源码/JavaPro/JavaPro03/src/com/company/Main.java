package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //手机通讯录
        //1.有多个分组（A - #）
        //2.每个分组有多个联系人
        //3.联系人信息（姓名，手机号）
        //4.联系人手机号可以有多个，不能重复
        //5.联系人姓名可以重复

        //创建联系人类People
        //属性：姓名（name,String），电话（phoneSet,HashSet<String>）

        //2.一个分组 ArrayList<People>

        //1.多个分组：TreeMap<String, ArrayList<People>>
        boolean isLoop = true;
        Scanner scanner = new Scanner(System.in);
        AddressList addressList = new AddressList();
        //测试数据
        addressList.addPeople("小名","123123");
        addressList.addPeople("小黑","123123213213");
        addressList.addPeople("小哈","123123213213");
        addressList.addPeople("小哈哈","123123213213");
        addressList.addPeople("小嘿嘿欸","123123213213");
        while (isLoop) {
            System.out.println("欢迎进入手机通讯录！");
            System.out.println("1.查看联系人");
            System.out.println("2.添加联系人");
            System.out.println("3.删除联系人");
            System.out.println("4.模糊查找联系人");
            System.out.println("0.退出");
            System.out.println("请选择");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addressList.show();
                    break;
                case 2:
                    System.out.println("请输入姓名");
                    String name = scanner.next();
                    System.out.println("请输入电话");
                    String phone = scanner.next();
                    addressList.addPeople(name,phone);
                    System.out.println("添加成功");
                    break;
                case 3:
                    System.out.println("请输入分组名");
                    String groupName = scanner.next();
                    System.out.println("请输入序号");
                    int index = scanner.nextInt();
                    boolean b = addressList.romvePeople(groupName,index);
                    if (b){
                        System.out.println("删除成功");
                    }else{
                        System.out.println("删除失败，分组名或序号有误");
                    }
                    break;
                case 4:
                    System.out.println("请输入关键字");
                    String keyWorld = scanner.next();
                    addressList.findPeoole(keyWorld);
                    break;
                case 0:
                    isLoop = false;
                    System.out.println("Bye!");
                    break;
                default:
                    break;
            }
        }
    }
}
