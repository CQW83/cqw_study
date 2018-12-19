public class Student {
    //无返回值：返回值类型不能省略使用void；
    //无参数：括号是不能省略的
    public void  buyWater1(){
        System.out.println("没钱");
    }
    //无返回值有参数
    //有参数 ：在括号中写参数的类型和参数名
    public void buyWater2(int money){
        System.out.println("钱被狗儿叼走了");
    }
    //有返回值，无参数
    //返回值的数据类型由返回值决定;方法体内需要使用return返回数据
    public int buyWater3(){
        System.out.println("谈钱，俗");
        return  10;
    }
    //有返回值有参数
    //多个参数用“，”隔开
    public  int buyWater4(int money,int count){
        System.out.printf("给了%d,买了%d瓶水\n",money,count);
        return     money -  count * 3;
    }
    public void select(int n){
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d\t",i);
        }
    }
    public void jiShu(int m ,int j){
        for (int i = m; i <= j; i++) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
