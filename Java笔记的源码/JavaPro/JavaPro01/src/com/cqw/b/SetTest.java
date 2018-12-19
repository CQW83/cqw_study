package com.cqw.b;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //Set接口下的方法
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("3");
        System.out.println(set);

        //数组去重
        int[] array = {12,23,32,12,43,23};
        Set<Integer> se1 = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            se1.add(array[i]);
        }
        System.out.println(se1);
        Integer[]  array1 = new Integer[se1.size()];
        se1.toArray(array1);
        System.out.println(Arrays.toString(array1));

        Set<Boy> boySet = new HashSet<>();
        boySet.add(new Boy("小名1",10));
        boySet.add(new Boy("小名2",11));
        boySet.add(new Boy("小名3",13));
        boySet.add(new Boy("小名3",13));
        System.out.println(boySet);
        //判断元素是否重复
        //1.hashCode()
        //2.equals()

        //默认hashCode()和equals()都是根据内存地址进行比较的
        //如果不想根据内存地址进行比较，就可以重写hashCode()和equals()方法

    }
}
