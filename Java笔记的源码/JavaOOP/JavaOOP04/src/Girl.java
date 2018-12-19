public class Girl {
    //非静态属性
    public String name = "小白";
    protected String sex ;
    private int age = 10;
    private  double height  = 1.50;

    //无参构造方法
    public Girl(){

    }
    //有参构造方法
    public  Girl(String name,String sex,int age, double height){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
    }

    //非静态方法
    public void say(){
        //在类的内部操作：属性么 或 this.属性名
        System.out.printf("我的名字是%s,我是%s的，我%d岁，我%.2f高\n",this.name,sex,age,height);
    }

    //设置器：为属性赋值的方法
    public void setHeight(double height){
        this.height = height;
    }
    //访问器：获取属性的方法
    public double getHeight(){
        return height;
    }


}
