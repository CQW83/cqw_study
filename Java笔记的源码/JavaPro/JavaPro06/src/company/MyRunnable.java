package company;

//1.创建实现了Runnable接口的类
//2.重写run方法
//3.在run方法内写准备在子线程中执行的代码
//4.创建MyRunnable对象
//5.使用Thread的有参构造方法，把MyRunnable对象传过去
//6.Thread对象调用start方法
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        Waiter waiter1 = new Waiter("鹿晗","男");
        waiter1.server();
    }
}
