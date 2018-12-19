import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java是强类型语言

        //数据类型转换（布尔类型不能参与数据类型转换）
        //1.隐式转换(自动转换)：把所占字节少的数据类型转换成所占字节多的数据类型，是安全的转换。由系统自动执行
     /*   byte a1 = 10;
        int  a2 = a1;
        System.out.println("a2 = " + a2);

        //2.显示转换(强制转换):把所占字节多的数据类型转换成所占字节少的数据类型，是不安全的转换。由人工转换
        int b1 = 10;
        byte b2 = (byte) b1;
        System.out.println("b1 = " + b1);

        // 字符类型的数据类型转换
            int c1= 0x1889898;
            char c2= (char) c1;
            //char c3= (char) (c1-32);
        System.out.println("c2 = " + c2);
       // System.out.println("c3 = " + c3);
       */
        //运算符
        //1.关系运算符
        // > <  >= <=  == !=
        //2.逻辑运算符
        // && || ！
        //逻辑与 && 并且
        //规则：两侧同时为真，才为真，否则为假
        //逻辑或 ：|| 或者
        //规则：两侧同时为假，才为假，否则为真
        //逻辑非：！
        //规则：真变假，假变真
        //逻辑运算符的短路现象
        //1.逻辑与的短路:左侧为假，右侧不参与运算。
//        int i=3,j=5;
//        int c=1;
//        boolean   result =i >j && ((c=2) ==1);
//        System.out.println("result = " + result);
//        System.out.println("c = " + c);
//
//        //2.逻辑或的短路:左侧为真，右侧不参与运算
//        result= i<j||((c=2)==1)  ;
//        System.out.println("result = " + result);
//        System.out.println("c = " + c);
//
        //  程序的三大结构
        // 1.顺序结构：从main方法开始，从上向下从左向右依次执行。
        // 2.分支结构：程序执行到某个位置，进行条件判断，根据不同的结果执行不同的语句。
            //1.if语句
                    /*
                      a.
                        if(条件表达式){
                               语句
                        }
                        执行顺序：先判断条件表达式的结果，如果为ture，执行大括号中的语句 false，则跳过

                      b.
                        if(条件表达式){
                            语句1
                        }else{
                            语句2
                        }
                        执行顺序： 先计算表达式的结果，如果为ture，执行语句1；false，执行语句2
                      c.
                        if(条件表达式1){
                            语句1
                        }else if(条件表达式2){
                            语句2
                        }else{
                            语句3
                        }
                        执行顺序：先计算条件表达式1的结果，如果结果为true，执行语句1；
                        false ，在计算条件表达式2的结果如果为true，执行语句2；false，执行语句3
                    */
                    //练习，输入一个整数，如果大于10，输出他的五倍
//                Scanner scanner =new Scanner(System.in);
//                int a= scanner.nextInt();
//                if(a>10){
//                    System.out.println(a*5);
//                }
                // 某程序员的老婆叫他上街买几个桃子，吩咐如果有卖西瓜，买一个。 后来他就真的只买了一个桃子回来。
            /*    int  peach = 0,watermelon=0;
                Scanner scanner =new Scanner(System.in);
                System.out.println("需要买几个桃子？：");
                peach=scanner.nextInt();
                System.out.println("如果看到西瓜请按1如果没有看到请按0");
                watermelon= scanner.nextInt();
                if(watermelon == 1){
                    peach=1;
                    System.out.println("买了"+peach+"个桃子");
                }
                    System.out.println(peach);
            */

            //获取用户性别，输入f为“女”，其他为 “男”
          /*  String sex = "男" ;
                Scanner scanner =new Scanner(System.in);
                System.out.println("请输入性别");
                String s = scanner.next();
                if( s.equals("f") ){
                    sex="女";
                }
            System.out.println("sex = " + sex);
            */

        /*  //练习： 输入两个整数，求最大值
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入两个整数");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
             if(a>b){
                 System.out.println(a);
             }else {
                 System.out.println(b);
             }
           */
            // 练习：输入年龄,判断年龄是否在[18,24]范围内，在，输出“继续交往”；不在，输出pass
                //输入身高，判断身高是否满足[1.6,1.7]。
        /*    Scanner scanner =new Scanner( System.in);
            System.out.println("请输入年龄");
            int age = scanner.nextInt();
            if(age>= 18 && age<= 24){
                System.out.println("请输入身高");
                double height =scanner.nextDouble();
                if (1.6<= height && height<=1.7){
                    System.out.println("继续交往");
                }else {
                    System.out.println("pass");
                }
            }else {
                System.out.println("pass");
            }
        */
        /*    Scanner scanner= new Scanner(System.in);
            System.out.println("请输入成绩：");
            double score =scanner.nextDouble();
            if (score>=0&& score<=100) {
                if (score >= 90) {
                    System.out.println("优秀");
                } else if (score >= 80) {
                    System.out.println("良好");
                } else if (score >= 70) {
                    System.out.println("中等");
                } else if (score >= 60) {
                    System.out.println("及格");
                } else {
                    System.out.println("不及格");
                }
            }else {
                System.out.println("不在范围内");
            }
            */
            //输入年份，判断是否是闰年
          /*  Scanner scanner = new Scanner(System.in);
            System.out.println("请输入年份");
            int year =scanner.nextInt();
            if(year%400==0 || (year%4==0 && year%100!=0)){
                System.out.println("是闰年");
            }else{
                System.out.println("不是闰年");
            }
            */

            //2.switch语句
            //3.条件运算符  条件表达式？表达式1 ：表达式2; 执行顺序：判断条件表达式的结果，结果为true 返回表达式1的值
        // 结果为false 返回表达式2的值
            /*Scanner scanner =new Scanner(System.in);
            System.out.println("输入两个数");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a < b ? a:b);
            */
            Scanner scanner =new Scanner(System.in);
            System.out.println("输入三个数");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(a < (b<c?b:c) ? a : (b<c?b:c));

        // 3.循环结构：程序反复执行某些代码，直到条件不满足。
    }
}