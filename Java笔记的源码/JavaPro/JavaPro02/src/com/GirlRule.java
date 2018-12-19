package com;

import java.util.Comparator;

public class GirlRule<T extends  Girl> implements Comparator<T> {

    @Override
    public int compare(T girl1, T girl2) {
      if(girl1.getAge() > girl2.getAge()){
          return 1;
      }else if(girl1.getAge() < girl2.getAge()){
          return -1;
      }else{
            if(girl1.getHeight()> girl2.getHeight()){
                return 1;
            }else if (girl1.getHeight() < girl2.getHeight()){
                return -1;
            }else{
                return 0;
            }
      }
    }
}
