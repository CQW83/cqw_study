package com.cqw.d;

public class Square extends Shape{
    private  int s;
    public Square(){

    }
    public Square(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + s +
                "} " + super.toString();
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public int perimeter() {
        return 4 * s;
    }

    @Override
    public int area() {
       return s * s;
    }
}
