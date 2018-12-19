package com.cqw.d;


public class Rectangle extends Shape {
   private  int length;
   private  int width;

    public Rectangle() {

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "} " + super.toString();
    }

      @Override
    public int perimeter() {
        return (length+width) * 2;
    }

    @Override
    public int area() {
        return length * width;
    }
}
