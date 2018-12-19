package company;

public class PoolRunnable implements Runnable {
    private String name;

    public PoolRunnable() {
    }

    public PoolRunnable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Waiter waiter =new Waiter(name,"男");
        waiter.server();
    }
}
