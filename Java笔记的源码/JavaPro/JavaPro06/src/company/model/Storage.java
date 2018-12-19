package company.model;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;


public class Storage {
    //仓库最大的存储量
    public static final int MAX_SIZE = 100;
    //仓库的载体
    //方式一：使用线程安全
    //private Vector arrayList = new Vector();

    //方式二：加锁
    private ArrayList arrayList = new ArrayList();
    //存
    public void add(int count) {
        synchronized (arrayList) {
            while ( count > MAX_SIZE - arrayList.size()) {
                System.out.printf("要添加%d个货物，当前空间为%d，空间不足!\n", count,  arrayList.size());
                try {
                    arrayList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < count; i++) {
                arrayList.add(new Object());
            }
            System.out.printf("要添加%d个货物,添加成功，当前空间为%d\n", count, MAX_SIZE - arrayList.size());

            arrayList.notifyAll();
        }
    }

    //取
    public void minus(int count) {
        synchronized (arrayList) {
            while (count > arrayList.size()) {
                System.out.printf("要取%d个货物，当前货物为%d，货物不足!\n", count, arrayList.size());
                try {
                    arrayList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < count; i++) {
                arrayList.remove(0);
            }
            System.out.printf("要取%d个货物,取货成功,当前货物为%d\n", count, arrayList.size());
            arrayList.notifyAll();
        }
    }
}
