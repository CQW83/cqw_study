package com.cqw.a;

public class Utils<T> {
    public void print(T t){
        System.out.println("t =" + t);
    }
    public void  print(T[] t){
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+" ");
        }
        System.out.println();
    }

}
