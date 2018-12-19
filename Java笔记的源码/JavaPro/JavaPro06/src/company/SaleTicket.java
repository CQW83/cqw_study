package company;

import java.util.concurrent.locks.ReentrantLock;

public class SaleTicket implements Runnable {
    //总票数
    private int count = 100;
    //卖出的票数
    private int saleCount = 0;

    // 当多个线程使用相同的数据时，会出现资源抢夺
    //解决方案：对共享数据的处理，一个时刻，只能有一个线程在处理

    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (count > 0) {
                    count--;
                    saleCount++;
                    String name = Thread.currentThread().getName();
                    System.out.printf("[%s]卖了第%02d张票，剩余%02d张票\n", name, saleCount, count);
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
