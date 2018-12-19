package com;

import java.util.Comparator;

public class MyRule<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if (o1 instanceof Integer && o2 instanceof Integer) {
            Integer a1 = (Integer) o1;
            Integer a2 = (Integer) o2;
            if (a1 > a2) {
                //如果返回1 在哪 排序方向就在哪
                return -1;
            } else if (a1 < a2) {
                return 1;
            } else {
                return 0;
            }
        }
            return 0;
    }
}
