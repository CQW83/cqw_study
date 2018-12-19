import javax.xml.transform.Source;
import java.util.Date;
import java.util.Calendar;
import  java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //创建对象格式
        //类名 对象名 = new 构造方法();
      /*  Girl girl = new Girl();
        girl.sayHi();
        Girl girl1 = new Girl("Anny","女");
        girl1.sayHi();
        //静态属性（类属型）和非静态属性（实例属性）的区别
        //1.非静态属性通过对象获取;静态属性通过类或对象获取，推荐使用类
        //2.每个对象都有属于自己的非静态属性；多个对象公用一个静态属性
        System.out.println(girl.name);
        System.out.println(Girl.age);
        girl.age = 100;
        System.out.println(girl.age);
        //静态方法和非静态方法的区别
        //1.非静态方法通过对象调用;静态方法通过类或对象调用，推荐使用类
        //2.在非静态方法中可以调用非静态方法和静态方法，在静态方法中只能调用静态方法
        //3.在非静态方法中可以调用静态属性和非静态属性，在静态方法中只能调用静态属性
        //4.this只能在非静态方法中使用
        girl.shoping();
        Girl.makeup();
        */

        //系统类的学习
        //1.API文档
        //2.百度

        //Scanner
        Scanner scanner = new Scanner(System.in);
        //Random
        Random random = new Random();
        //String
        String str = new String("字符串");
        System.out.println(str);
        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("这是字符串");
        System.out.println(stringBuffer.reverse());
        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("这是一段字符串");
        stringBuilder.delete(2, 4);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        //Math
        System.out.println(Math.abs(-1));
        System.out.println(Math.addExact(100, 1000));
        System.out.println(Math.cos(0.5));
        //Date
        System.out.println();
        Date date = new Date();
        System.out.println(date.toString());
        //Calendar


        System.out.println();
    }
}
