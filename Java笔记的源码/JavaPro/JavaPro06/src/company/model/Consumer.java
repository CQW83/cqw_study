package company.model;

public class Consumer extends Thread {
    private Storage storage;
    private int count;

    public Consumer(Storage storage, int count) {
        this.storage = storage;
        this.count = count;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Consumer() {
    }

    @Override
    public void run() {
        storage.minus(count);
    }
}
