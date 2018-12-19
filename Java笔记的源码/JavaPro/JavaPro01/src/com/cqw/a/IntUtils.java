package com.cqw.a;

public class IntUtils {
    //方法
    //打印整数
    public void print(int a){
        System.out.println(a);
    }
    //计算两个整数之和
    public int sum(int a, int b){
        return a + b;
    }
    //遍历整型数组
    public void print(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\t",a[i]);
        }
        System.out.println();
    }
}
