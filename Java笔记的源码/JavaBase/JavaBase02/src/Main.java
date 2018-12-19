import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //软件：处理数据的程序
        //程序： 数据+逻辑代码
        //数据存放过程：硬盘-> 内存->cpu缓存->cpu
        /*数据类型作用：1.提供多种数据类型，最大化使用存储空间
                        2.决定所占空间大小
                        3.决定存放什么样的数据
           java数据类型的分类：           -2^7 到2^7-1
           1.基本数据类型：int short long byte(整型)  double，float（浮点型） char（字符型） boolean（布尔型）
           2.引用数据类型：


           常量：程序运行期间，不能改变的量
                    整型常量：
                        十进制数 ：123，-123
                        二进制：   0b00001010  0b10001010   有符号区分的二进制，第一位是1为负数，0为正数
                        八进制：   0123  0521
                        十六进制： 0x3, 0x3A
                        长整形十进制：123L
                    浮点型常量：
                        单精度：3.14f
                  (默认)双精度：3.14d
                    字符型常量：'a' ,'1','?','你'，' ' 单引号只能占一个位置   Java中的字符型支持Unicode编码
                    布尔型常量： true ，false
                    字符串常量："人名"

                    常见文字编码：
                    ASCII  支持128个转换规则
                    Unicode  万国码
                    GBK     中国制定的，支持汉字转换规则+ASCII转换规则
                    UTF-8  是Unicode的一种算法 优化了存储结构
           变量：程序运行期间，可以改变的量
                需要先定义后使用。
                格式： 数据类型  变量名=初始值
                变量使用驼峰命名法
              数据类型的选择：
              1.根绝要存储的数据决定
              2.整型默认使用int，浮点型默认使用double

              标识符（文件名，工程名，类名，变量名等）的命名规则：
              1.由数字，字母，下划线 $ 组成，不能以数字开头
              2.不能使用系统的关键字（保留字）
              3.见名知意，建议使用英文名，不推荐使用拼音和汉字
              4.使用命名法则 a.匈牙利命名法  类型首字母+名字 iNumber
                             b.驼峰命名法    除第一个单词以外，单词首字母大写  appleCount
                             c.帕斯卡命名法  每个单词首字母大写  AppleCount
                             d.蛇形命名法   单词之间用下划线连接  apple_count
                             e.尖叫蛇形命名法 每个单词都大写，用下划线连接 APPLE_COUNT
              5.在同一作用域内不能重名


        */
        //输出语句
        //不换行输出
//        System.out.print("汉字");
//        //换行输出 快捷键sout
//        System.out.println("汉字");
//        //格式串输出（不换行） 快捷键souf
//        System.out.printf("汉字");
        //转义字符：避免破坏字符串的结构，实现特殊效果
        //   \" 双引号   \' 单引号  \n 换行  \t空出一个tab键的距离  \u6210\u542f\u6587 X代表1位16进制位  整体代表Unicode编码值
//        int price =100;
//        String color = "红色";
//        System.out.println("我的"+color+"手机价格是"+price+"元");
//        System.out.printf("我的%s手机价格是%d元",color ,price);
//
        /*运算符
         *   1.赋值运算符  =   从右向左执行
         *   2.算数运算符 -- ++ + - * / % 从左向右执行   + 字符串的拼接 特殊用法代表正号 - 特殊用法代表负号
         *                                               ++在后,参与运算的是+1前的值，++在前，参与运算的是+1后的值
         *   3.符合运算符  += -= *= /=  %=  从左向右执行
         * */
//        int a = 10, b = 20;
//        int temp = 0;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a=" + a + "b=" + b + "c=" + temp);
//        int result = a+b;
//        System.out.println("result="+result);
        
//        int x=10,y=4;
//        int z=x%y;
//        y=z++;
//        x= ++y;
//        System.out.println("z = " + z);
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
        /*
            表达式：由变量，常量，运算符组成 有最终结果
            根据表达式的结果类型分为
            1.整型表达式 比如1+2，100 result result+20
            2.浮点型表达式
            3.字符型表达式
            4.条件表达式 ： 表达式的结果为布尔类型

            语句：程序执行的最小单位，语句以分号结束 单独一个分号代表空语句

         */

        /*
            输入语句：接收你向控制台输入的值
            输入语句的使用：
                 创建输入工具,输入工具可以反复使用

        */
      /*  Scanner scanner= new Scanner(System.in);
        //获取用户在控制台输入的内容
        System.out.println("请输第一个整数");
        int ss=scanner.nextInt();
        System.out.println("请输第二个整数");
        int s=scanner.nextInt();
        int num=s+ss;
        System.out.println(s+"与"+ss+"的和是"+num);
       */

      /*  Scanner scanner=new Scanner(System.in);
        System.out.println("请输入长方形的长和宽");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        System.out.println("周长为"+((a+b)*2));
        System.out.println("面积为"+a*b);
       */
        // 字符串类型 scanner.next()
        //字符 scanner.next().charAt(0)

        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入姓名");
        String name =scanner.next();
        System.out.println("请输入性别");
        char sex =scanner.next().charAt(0);
        System.out.println("请输入年龄");
        int age =scanner.nextInt();
        System.out.println("请输入身高");
        double height =scanner.nextDouble();
        System.out.printf("你的姓名是%s性别是%c年龄是%d身高是%f",name,sex,age,height);
    }
}
