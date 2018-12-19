
public class Main {

    public static void main(String[] args) {
    //Java是严格意思上面向对象的语言

    //面向对象编程：（OOP）Object Oriented Programming，迄今为止最接近人类思维的编程方式

    //面向对象的核心：
         //1.类：具有相同特征和行为的事物的抽象；
         //2.对象：万事万物皆对象

        //类和对象的区分：
        //看能不能具体到某个事物

        //类和对象的关系：
        // 1.类是抽象的，对象是具体，
        // 2.类是对象的类型（数据类型）
        // 3.对象是类的实例 （变量）

        //创建类
        /*
        访问修饰符 class 类名 {
                 特征1
                 特征2
                  ...
                 行为1
                 行为2
                  ...
        }
        类名使用大驼峰法

        特征 ->属性（字段）
        格式：
          访问修饰符，数据类型，属性名
          属性名使用小驼峰法

        行为 ->方法
        格式：
          访问修饰符 返回值类型 方法名 （参数列表）{
                语句
          }
          方法名使用小驼峰法
        */

        // 创建类 相当于 生成一个新的数据类型

        //一般把变量car叫对象
     /*   Car smallCar = new Car();
        //创建对象的格式： 类名 对象名 = new 类名(); 对象名使用小驼峰法
        //对属性赋值格式：  对象.属性 = 值
        smallCar.color = "红色";
        smallCar.wheelCount = 2;
        smallCar.brand = "奔驰";
        //获取属性的值
        //直接打印即可
        //调用方法
        // 格式 ：对象.方法名（）；
        smallCar.run();
        System.out.println("小汽车是" + smallCar.color + "牌子是" + smallCar.brand + "有" + smallCar.wheelCount +"轮子");
        smallCar.stop();
        Dog dog = new Dog();
        dog.brand = "拉布拉多";
        dog.color = "白色";
        dog.name  = "小白";
        dog.say();
    */
/*
    Girl girl = new Girl();
    girl.name = "老大";
    girl.age  =  20;
    girl.say();
    girl.shopping();
    girl.cook();
    girl.eat();
    Girl girl1 = new Girl();
    girl1.name = "老二";
    girl1.age = 16;
    girl1.say();
    girl1.shopping();
    girl1.cook();
    girl1.eat();
  */
    //面向过程编程解决问题的思路
        //1.分析解决问题的步骤
        //2.把每个步骤形成代码块
        //3.依次执行

    //面向对象编程解决问题的思路
        //1.分析问题中出现的对象
        //2.分析对象的特征和行为，把具有相同特征和行为的事物归程一类
        //3.通过类生成对象
        //4.对象调用方法
    /*
        Person father = new Person();
        father.name = "爸爸";
        Person son  = new Person();
        son.name = "儿子";
        son.say("爸爸,我今天的日记开头是这样写的:夜深了,妈妈在打麻将,爸爸上网");
        father.say("日记要有细节才更生动");
        son.say("那我改成:夜深了,妈妈在赌钱,爸爸在网恋");
        father.say("日记要源于生活,高于生活,要以正面宣传为主!");
        son.say("夜深了,妈妈在挣钱,爸爸在学电脑...这样行不?");
        father.say("...");
        son.say("最后写成了:夜深了,妈妈还在挣三个叔叔的钱,爸爸还在电脑前练手");
        */
        //方法：具有特定功能的代码块
        //方法可以重复使用，减少代码的冗余
            //方法分类：
                //按来源分：
                    //1.系统方法：JDK提供的方法
                    //2.自定义方法：自己创建的方法
                    //3.第三方方法：除了系统和自定义方法以外的方法
                //根据有误返回值，参数 分为
                    //1.无返回值无参数
                    //2.无返回值有参数
                    //3.有返回值无参数
                    //4.有返回值有参数
         /*   Student student = new Student();
            student.buyWater1();
            student.buyWater2(3);
            //形参：形式参数，方法定义时的参数，没有确切的值。当方法调用时才能确定值，
            //实参：实际参数，调用方法时的参数，有确切的值。调用方法时会把实参的值传递给形参，实参传递给形参是拷贝的过程
            int  count = student.buyWater3();
            System.out.println(count);
            int  money = student.buyWater4(100,15);
            System.out.println("找回"+money);
            */
        Student student = new Student();
       // student.select(20);
        student.jiShu(4,10);
    }
}
