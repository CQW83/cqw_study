import org.omg.PortableServer.ForwardRequest;
import sun.font.FontRunIterator;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            运算符的分类
              按功能分类：
               1. 赋值运算符： =
               2. 算术运算符：+ - * / % ++ --
               3. 符合运算符：+= -= *= /= %=
               4. 比较运算符：> < == <= >=
               5. 逻辑运算符：&&  || !
               6. 条件运算符：? :
              按操作数的的个数，分为：
              1.单目运算符：++ -- ! +(正号) -（负号）
              2.双目运算符： = + - * / %  += -= *= /= %=  < > == <= >= && ||
              3.三目运算符： ? :
         */
        //代码规范
        //1.单目运算符和操作数之间不加空格，双目运算符、三目运算符和操作说之间需要加一个空格
        //2.遇到大括号，操作代码缩进一个tab键的距离  tab键在不同的操作系统中距离不同，一般距离为及格空格
        //3.逗号后面加空格

        //练习：输入季节（1：春 2：夏 3：秋 4：冬）判断月份
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("请输入季节");
        int a = scanner.nextInt();
        if(a == 1){
            System.out.println("3月到5月");
        }else if(a == 2){
            System.out.println("6月到8月");
        }else if(a == 3){
            System.out.println("9月到11月");
        }else if(a == 4){
            System.out.println("12月到2月");
        }else{
            System.out.println("输入数据有误");
        }
        */
        //switch
        /*
        switch (整型表达式/字符表达式/字符串表达式){
            case  值1：
                语句1；
                break；
            case  值2：
                 语句2；
               break；
           default：
                  语句3；
                break；
        }
        执行顺序：先计算结果，然后拿case的值进行匹配，相同则执行case中的语句，
        如果没匹配到，执行default 中语句当遇到break时，跳出switch 语句
        switch运行的效率高于if语句
        */
       /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int a = scanner.nextInt();

        switch ( a ){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("31天");
                break;
            case 2 :
                System.out.println("是否是闰年 0为是 ");
                int b = scanner.nextInt();
                if ( b == 0 ){
                    System.out.println("29天");

                }else {
                    System.out.println("28天");
                }
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("30天");
                break;
                default:
                    System.out.println("输入月份有误");
                    break;
        }
        */
        //循环结构分类
        //1.for循环
        //2.while循环
        //3.do...while循环
        /*
            for(循环变量初始化; 循环条件; 循环变量改变){
                循环体
            }
            执行顺序：
            第一次执行：先执行循环变量初始化，再执行循环条件 ，再执行循环体，然后循环变量改变，
            以后执行：循环条件，循环体，循环变量。当循环条件不满足时，循环结束。
            快捷键 fori
        */
      /*  for (int i = 0; i < 5; i++){
            System.out.println("中毒");
        }*/
      /*  for(int i=1; i<=100;i++){
            System.out.println(i);
        }
        */
      /*for(int i= 100; i >= 1; i--){
            System.out.printf(i + " ");
        }
        */
      /*
        for (int i = 1; i <=100; i++) {
            if ( i % 7 == 0 || i / 10 == 7 || i % 10 == 7){
                System.out.println("过 ");
            }else{
                System.out.println(i);
            }
        }
        */
        //随机数

        //产生随机数

        //System.out.println("number = " + number);
        //随机生成整数
        //random.nextInt()   -2^31 ~2^31-1
        //random.nextLong()  -2^63 ~2^63-1
        // 随机生成布尔
        //random.nextBoolean()  ture 和 false
        //随机生成浮点数
        //random.nextFloat()    [0,1)
        //random.nextDouble()   [0,1)
        //random.nextGaussian() [-1,1]
        //随机生成[x,y]的整数公式
        //random.nextInt(y - x + 1) + x
        // number = random.nextInt(16)+5 ;
        //System.out.println("number = " + number);
      /*  Random random = new Random();
        int sum = 0,min =37, max =25,number=0;

        for (int i = 0; i <10; i++) {
             number = random.nextInt(13) + 25;
            System.out.println("number = " + number);
             sum += number;
             if(max < number){
                 max = number;
             }
             if(min > number)
                min = number;
           }
            System.out.println("最大值"+ max);
            System.out.println("最小值是" + min);
            System.out.println("平均值是" + sum / 10.0);
        }
        */
      /*
        外层循环 控制行数
      for (int i = 0; i <= 2; i++) {
                内层循环 控制列数
            for (int j = 1; j < 6; j++) {
                执行次数=外层循环*内层循环次数
                System.out.printf(j + " ");
            }
            System.out.println();
        }
        外层循环执行一次，内层循环执行一遍，循环嵌套不能超过三层
        */
     /*   for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */
     /*   for (int i = 5; i >0; i--) {
            for (int j = 1; j<i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j-1 < i; j++) {
                System.out.printf(j+ "x" + i +"="+i*j +"\t");
            }
            System.out.println();
        }
    }
}

