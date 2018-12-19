package com.lanou.d;

public class Fraction {
    //属性
    private int top;
    private  int bottom;
    public  Fraction(){

    }
    public Fraction(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public void print(){
        System.out.printf("%d / %d\n",top,bottom);
    }
    private int gcd(int a , int b){
     /*   //穷举法
        int min = a < b ?  a : b;
        for (int i = min; i >= 2; i--) {
            if(a %  i ==0 && b % i ==0){
                return  i;
            }
        }
        return  1;
        */
     //辗转相除法
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return  a;
    }

    public void about(){
            int a = gcd(top,bottom);
            top /=a ;
            bottom /= a;
    }

    public Fraction  add( Fraction a){
        Fraction result = new Fraction();
        result.top = a.top * this.top + a.bottom * this.bottom;
        result.bottom = a.bottom * this.bottom;
        result.about();
        return result;
    }
    public static Fraction  add( Fraction a ,Fraction b){
        Fraction result = new Fraction();
        result.top = a.top * b.top + a.bottom * b.bottom;
        result.bottom = a.bottom * b.bottom;
        result.about();
        return result;
    }
}
