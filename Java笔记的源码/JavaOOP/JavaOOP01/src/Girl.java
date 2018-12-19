public class Girl {
    public String  name;
    public String  sex = "女";
    public int  age;

    public  void eat(){
        System.out.println("会吃");
    }
    public void shopping(){
        System.out.println("会买");
    }
    public void cook(){
        System.out.println("会做饭");
    }
    public void say(){
        System.out.println("我的名字" + name +"我的年龄" + age + "不要想了,我是"+ sex +"的" );
    }
}
