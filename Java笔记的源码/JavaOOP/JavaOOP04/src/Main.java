import com.lanou.a.Dog;
import com.lanou.c.RoadZombie;
import com.lanou.c.Zombie;
import com.lanou.d.Fraction;

public class Main {
    public static void main(String[] args) throws InterruptedException {
     /*   Girl girl = new Girl();
         girl.say();

        //面向对象的特征
        //1.封装
        //2.继承
        //3.多态
        //4.抽象

        //封装：把类的实现部分隐藏起来，选择性地暴露方法
        //封装的标准：高内聚，低耦合
        //内聚：模块内部成员的关联成都
        //耦合：模块间的关联程度

        // 访问修饰符控制作用范围
        //public：公开的 在任何地方都可以访问
        //在类的外部 对象.属性名
        //在类的内部操作：属性名 或 this.属性名
        girl.name = "娜美";
        System.out.println(girl.name);

        //protected：受保护的。 同包，本类，或子类中可以访问
        girl.sex="女";
        System.out.println(girl.sex);
        //省缺:在本类或同包中，可以访问
        //girl.age = 13;
        //System.out.println(girl.age);
        //private 私有的，只能在本类中访问
        girl.setHeight(1.3);
        System.out.println(girl.getHeight());


        //包;package,用于管理源代码
        //包以公司域名反写命名
        //包实质是一个有层次的文件夹，点代表下一级
        //在包中的类，第一行要加上所在包的路径
        //使用其他包中的类，需要导包
        //为了区分不同的类，可以使用全类名，即包路径+类名
        Dog dog = new Dog();
        dog.test();

        com.lanou.b.Dog dog1 = new com.lanou.b.Dog();
        dog1.test();
        */

        Phone  phone = new Phone();
        phone.action();
        phone.talk();
        phone.send();

        //继承：子类继承父类的属性和方法

        //Java中的继承特点：
        //1.单根继承：全部都是Object的子类
        //2.单向继承：一个类只能有一个父类，一个类可以有多个子类
        //3.构造方法不能被继承
        //4.子类的构造方法内需要调用父类的构造方法
        //5.子类的构造方法内没有调用父类的构造方法，系统会默认调用父类的无参构造方法
        //6.调用父类的构造方法必须出现在第一行
        //7.当父类提供的方法不满足子类的需求时，子类可以重写父类的方法

        //final
        //1.修饰变量:变量的值不能被修改
        //2.修饰属性：一般有public static final 修饰
        //3.修饰方法：final修饰方法 方法不能被重写
        //4.修饰类：类不能被继承


        //练习：封装僵尸类

        //普通僵尸类
        //总血量， 失血量
        //被打，死亡
      /*      Zombie zombie = new Zombie(50,3);
        System.out.println("游戏开始");
        while (zombie.getHP() > 0) {
            Thread.sleep(500);
            zombie.hitted();
        }
        zombie.die();
        */
        //路障僵尸类
        //总血量，失血量，装备
        //被打，死亡，失去装备
        //当血量是总血量的一半时，失去装备后，失血量是之前的二倍
   /*     RoadZombie roadZombie = new RoadZombie(80,2,"路障");
        System.out.println("游戏开始");
        while (roadZombie.getHP() > 0) {
            //Thread.sleep(500);
            roadZombie.hitted();
        }
        roadZombie.die();
        */

        //分数类
        //属性分子，分母
        //方法：打印，约分，分数相加的方法。

        Fraction  fraction = new Fraction(3,4);
        fraction.print();
        fraction.about();
        fraction.print();
        Fraction fraction1 = new Fraction(3,5);
        Fraction result = fraction1.add(fraction);
        result.print();

        //加 减 乘 除
        
    }
}
