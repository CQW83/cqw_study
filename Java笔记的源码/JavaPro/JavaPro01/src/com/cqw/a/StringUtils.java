package com.cqw.a;

public class StringUtils {
    //打印数组
    public void print(String s){
        System.out.println(s);
    }
    //字符串的拼接
    public String sum(String s ,String s1){
        return s + s1;
    }
    //打印字符串
    public void  print(String s[]){
        for (int i = 0; i < s.length; i++) {
            System.out.printf("%d\t",s[i]);
        }
        System.out.println();
    }
}
