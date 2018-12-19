package company;


//1.继承Thread类
//2.重写run方法
//3.在run方法内写准备在子线程中执行的代码
//4.创建MyThread对象，并调用start方法
public class MyThread extends Thread{

    @Override
    public void run() {
        //System.out.println(Thread.currentThread());
        Waiter waiter1 = new Waiter("咪咪","女");
        waiter1.server();

    }
}
