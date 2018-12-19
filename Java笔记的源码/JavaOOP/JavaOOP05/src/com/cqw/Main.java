package com.cqw;

import com.cqw.a.Chicken;
import com.cqw.a.Duck;
import com.cqw.b.*;
import com.cqw.c.Athlete;
import com.cqw.c.LanQiuAthlete;
import com.cqw.c.ZuQiuAthlete;
import com.cqw.d.Rectangle;
import com.cqw.d.Square;
import com.cqw.e.Student;
import com.cqw.e.Teacher;
import com.cqw.f.*;

public class Main {
    public static void main(String[] args) {
        //重载，重写，覆盖
        //1.重载（Overload）：在一个类中，方法名相同，参数个数或类型不同
        //2.重写（Override）：在父类和子类之间，当父类的方法不满足子类需求时，可以重写父类的非静态方法
        //3.覆盖（）：重写父类的静态方法

        // 多态：一个事物的多种形态
        //编译时多态：方法重载
        //运行时多态：父类对象可以接收子类对象

//        Bird bird = new Bird();
//        Chicken chicken = new Chicken();
//        Duck duck =  new Duck();
//        //调用方法时，先从本类中找方法，找不到时，再去父类中找 ，直到找到Object类
//        bird.fly();
//        chicken.fly();
//        duck.fly();

        //引用类型的数据类型转换
        //1.向上转型：子类转父类，是安全的转换
       // bird = chicken;
        //2.向下转型：父类转子类，是不安全的转换
        //duck = (Duck) bird;(无法转换)
        //对象 instanceof 类 ：判断这个对象是否是这个类的对象
       /* if(bird instanceof Chicken) {
            chicken = (Chicken) bird;
        }
        if(bird instanceof Duck) {
            duck = (Duck) bird;
        }
        */

       //遛狗
       //1.创建boy类
       //2.创建BlackDog,行为:跑（边跑边打架）
       //3.创建WhiteDog,行为 跑（边跑边撒娇）
       //4.创建YellowDog,行为 跑（边跑边占地盘）
/*
        Boy boy  = new Boy();
        BlackDog blackDog = new BlackDog();
        WhiteDog whiteDog = new WhiteDog();
        YewlloDog yewlloDog = new YewlloDog();
        Dog dog = new Dog();
        //方式1
//        boy.playWithBlackDog(blackDog);
//        boy.playWithWhiteDog(whiteDog);
//        boy.playWithYelloDog(yewlloDog);

        //方式2
//        boy.playWithDog(blackDog);
//        boy.playWithDog(yewlloDog);
//        boy.playWithDog(whiteDog);

        //方式3
        boy.playWithDog(blackDog);
        boy.playWithDog(yewlloDog);
        boy.playWithDog(whiteDog);
*/

       // Athlete athlete = new Athlete("杨洋",18);
        //System.out.println(athlete);


        //抽象方法 由abstract修饰的方法
        //抽象方法的特点
        //1.抽象方法没有方法体
        //2.抽象方法必须放在抽象类中

        //抽象类 ：有abstract修饰的类
        //抽象类的特点：
        //1.抽象程度：抽象类 > 类 > 对象
        //2.抽象类不能例化对象
        //3.抽象类需要先转成普通类（继承抽象类）才能实例化对象
        //4.抽象类中可以有抽象方法，也可以有非抽象方法
        //5.一个类继承于抽象类，有两种选择：a.重写抽象类中的抽象发方法 b.本身也是抽象类

//        Athlete athlete = new Athlete();
   /*     Square square = new Square(5);
        System.out.println(square.perimeter());
        System.out.println(square.area());
        Rectangle rectangle = new Rectangle(2,5);
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());
*/

     /*   Student student = new Student();
        student.like();

        Teacher teacher = new Teacher();
        teacher.sleep();
        */


     //接口:把公共的属性和方法封装成一个特定的功能集合
     /*
        访问修饰符 intetrface 接口名{
            属性1
            属性2
            ···
            方法1
            方法2

        }

      特点：
        1.接口中的方法都是抽象方法：默认都是public abstract
        2.接口中默认属性都是public static final
        3.一个类实现了接口，有两种选择
            a.重写接口中的方法
            b.本身也是抽象类
        4.接口不能实例化对象

        类和接口的关系
        1.类和类之间：单继承 extends
        2.类和接口之间：多实现 implements
        3.接口和接口间的关系：多继承 extends

      */
//        Airplane airplane = new Airplane();
//        airplane.fly();
//        Bird bird = new Bird();
//        bird.fly();
//        Fly fly = new Airplane();

        Cargo airplane = new Airplane();
        airplane.pullGoods();
        airplane.pullPeople();
        Cargo horse = new Horse();
        horse.pullGoods();
        horse.pullPeople();


    }
}
