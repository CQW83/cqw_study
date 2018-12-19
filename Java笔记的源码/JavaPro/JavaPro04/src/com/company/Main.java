package com.company;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        //Java：有问题的代码不能运行

        //问题的表现（）
        //1.错误（Error）
        //2.异常（Exception）

        //解决错误方法：修改代码
        //

        //解决异常的方式
        //1.自行处理    try···catch
        //2.抛出异常

        //为什么要出现错误？
        //Java的编译器或运行环境的反馈

        //为什么要出现异常
        //
        int[] a1= new int[10];
        int[] a2 ={11, 22, 33};
        int[] a3 ={11};
        int[] a4 =null;
//        System.out.println(Main.selecta(a1));
//        System.out.println(Main.selecta(a2));
//        System.out.println(Main.selecta(a3));

        try {
            //有可能出现异常的代码
            //System.out.println(selecta(a4));
            System.out.println(selecta(a3));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (NoSuchElementException e) {
            //当出现异常时会执行
            //catch用于捕获异常对象
            System.out.println(e.getMessage());
        }finally {
            //永远都会执行
            System.out.println("finally");
        }
       // selecta(a3);

        //throw 和 throws 的区别
        //throw用在方法体中,throws用在方法声明中
        //throw抛出异常对象，throws抛出异常类型

        //final, finally ,finalize的区别
        //final:用于修饰变量，属性，方法，类
        //finally:使用try...catch....finally结构的一部分，finally中的代码肯定会执行
        //finalize：Object类中的方法，析构方法，用于销毁对象（JDK9 弃用了）

        //异常的分类
        //1.运行时异常（非检查型异常）:继承于RuntimeException的异常，不用强制要求，对异常进行处理
        //2.非运行时异常（检查时异常）：除运行时异常以外的异常，必须进行异常处理

        //常见的运行时异常：
        //1.ArithmeticException:运算异常 比如 1/0
        //2.ArrayStoreException:数组存储异常/比如把字符串放到整型数组中
        //3.ClassCastException:类型转换异常，比如向下转型
        //4.IllegalArgumentException:非法参数异常，比如：实参类型与形参类型不一致
        //5.IndexOutOfBoundsException:下标超出范围异常，比如数组越界
        //6.NegativeArraySizeException:数组大小为负
        //7.NoSuchElementException 没有这个元素，比如迭代器获取下一个元素
        //8.NullPointerException:空指针异常，比如使用null调用方法或属性
        //9.UnsupportedOperationException:不支持这种操作，比如：使用post方法去调用get接口
    }
    /*
        //版本1
        //问题：有可能数组没有第二个元素
        static int selecta(int[] a){
        return a[1];
    }
    */
    /*
    //版本2
    //问题：当数组没有第二个元素时，返回什么
    static int selecta(int[] a) {
        if(a.length < 2){
            return 0;
        }
        return a[1];
    }
    */
   /*
    //版本3
    //问题：数组有可能为null
    static int selecta(int[] a) throws Exception {
        if(a.length < 2){
            throw  new Exception("数组没有第二个元素");
        }
        return a[1];
    }
    */
   /*
    //版本4
    //问题：没办法做不同的异常做不同的处理
    static int selecta(int[] a) throws Exception {
        if (a == null){
            throw new Exception("数组为null");
        }
        if(a.length < 2){
            throw  new Exception("数组没有第二个元素");
        }
        return a[1];
    }
    */
    /*
    //版本5.1
    //
    static int selecta(int[] a) throws Exception {
        if (a == null){
            throw new NullException("数组为null");
        }
        if(a.length < 2){
            throw  new Exception("数组没有第二个元素");
        }
        return a[1];
    }
    */
    /*
    //版本5.2
    //
    static int selecta(int[] a) throws Exception {
        if (a == null){
            throw new NullPointerException("数组为null");
        }
        if(a.length < 2){
            throw  new Exception("数组没有第二个元素");
        }
        return a[1];
    }
    */
    //版本5.3
    //
    static int selecta(int[] a) throws NullPointerException,NoSuchElementException {
        if (a == null){
            throw new NullPointerException("数组为null");
        }
        if(a.length < 2){
            throw  new NoSuchElementException("数组没有第二个元素");
        }
        return a[1];
    }

}
