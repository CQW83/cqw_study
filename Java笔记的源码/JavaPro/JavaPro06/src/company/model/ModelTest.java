package company.model;

public class ModelTest {
    public static void main(String[] args) {
        Storage storage = new Storage();

        Producer p1 = new Producer(storage,30);
        Producer p2 = new Producer(storage,50);
        Producer p3 = new Producer(storage,80);
        p1.start();
        p2.start();
        p3.start();
        Consumer c1 = new Consumer(storage,60);
        Consumer c2 = new Consumer(storage,30);
        Consumer c3 = new Consumer(storage,50);
        Consumer c4 = new Consumer(storage,80);
        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }
}
