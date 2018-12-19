public class Girl {
    //属性的默认值是和数据类型初始化时一样的
//    byte, short ,int,long: 0
//    float ,double ：0.0
//    char: '\u0000'
//    boolean:false
//    引用类型：null

    //为属性赋默认值
    //方法1
    public String name = "小薇";
    public String gender="女";
    //静态属性：有static修饰的属性
    //特点：
    //1.
    public static int age = 10;
    //方式2：构造方法,优先级更高
    //1.没有返回值数据类型
    //2.方法名和类名保持一致
    //3.当类中没有构造方法时，系统会形成一个无参构造方法
    //4.配合new 用于创建对象
    //5.用于初始化属性的值
    public Girl(){
        name = "鞠婧祎";
        gender = "女";
    }
    public Girl(String name ,String gender){
         this.name = name;
         this.gender = gender;
    }

    public void shoping (){
        System.out.println("逛街");
    }

    public void play(){
        shoping();
        System.out.println("玩游戏");
        System.out.println(gender);
        System.out.println(age);
        //this:相当于调用该方法的对象

    }
    public static void study(){
        System.out.println("化妆");

        System.out.println(age);
    }
    public  static void makeup(){
        System.out.println("学习");
    }
    public void sayHi(){
        System.out.printf("我是你的%s朋友,%s!\n",gender,name);
    }
}
