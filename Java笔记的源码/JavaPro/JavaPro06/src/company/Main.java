package company;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //进程：正在运行的程序，资源分配的最小单元

        //线程：进程中的一个执行单元，线程是CPU调度的最小单元

        //一个进程中至少要有一个线程，这个线程叫主线程;还可以添加新的线程，这些线程叫子线程

        //主线程
        //currentThread:获得主线程
        //Thread mainthread = Thread.currentThread();
        //System.out.println(mainthread);

        //创建线程
        //1.Thread子类
        //2.实现Runnable接口
        //3.线程池
    /*
        MyThread myThread = new MyThread();
        //在当前线程中执行，并没有开启新的线程
        //myThread.run();
        //开启子线程，并调用run方法
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        Waiter waiter = new Waiter("鞠婧祎","女");
        waiter.server();
    */

        //线程池
        //缓存线程池
       /*
       ExecutorService executorService1 = Executors.newCachedThreadPool();
       ExecutorService executorService=new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
         */
    /*
       //固定池
               ExecutorService executorService = Executors.newFixedThreadPool(3);

        //向线程池中添加执行的代码
        for (int i = 1; i < 10;i++) {
            Thread.sleep(5);
            Runnable runnable = new PoolRunnable("张三" + i);
            executorService.execute(runnable);
        }
//        Runnable runnable1 = new PoolRunnable("李四");
//        executorService.execute(runnable1);

        */
    //抢资源
        SaleTicket saleTicket = new SaleTicket();
        Thread thread1 = new Thread(saleTicket,"学生窗口");
        Thread thread2 = new Thread(saleTicket,"军人窗口");
        Thread thread3 = new Thread(saleTicket,"普通窗口");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
