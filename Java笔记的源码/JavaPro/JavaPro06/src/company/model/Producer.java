package company.model;

public class Producer extends Thread {

    private Storage storage;
    private int count;

    public Producer() {
    }

    public Producer(Storage storage, int count) {
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

    @Override
    public void run() {
        storage.add(count);
    }
}
