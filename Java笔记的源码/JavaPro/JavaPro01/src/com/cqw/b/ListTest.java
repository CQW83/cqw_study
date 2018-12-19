package com.cqw.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        //list接口中的方法
        //List中存的元素是有序的
        List<String> list = new ArrayList<>();
        //在尾部添加
        list.add("张飞");
        list.add("刘备");
        list.add("关羽");
        System.out.println(list);
        //插入
        list.add(2,"吕布");
        System.out.println(list);
        //获取指定位置上的元素
        System.out.println(list.get(2));


        //遍历List
        //快捷键 itli
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext(); ) {
            int i =  iterator.nextIndex();
            String next =  iterator.next();
            System.out.println(i+" " + next);
        }

        //查找元素
        //正向
        System.out.println(list.indexOf("吕布"));
        //反向
        System.out.println(list.lastIndexOf("貂蝉"));

        //删除元素
        String s = list.remove(0);
        System.out.println(list);
        System.out.println(s);

        //修改元素
        list.set(1,"貂蝉");
        System.out.println(list);

        //获取list的一部分
        List<String> list1 = list.subList(0, 2);
        System.out.println(list1);
    }
}
