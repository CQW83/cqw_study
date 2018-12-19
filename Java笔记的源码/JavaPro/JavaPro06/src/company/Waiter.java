package company;

public class Waiter {
    private String name;
    private String gender;

    public Waiter() {
    }

    public Waiter(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    //接客
    public void server(){
        for (int i = 1; i <= 1; i++) {
            System.out.printf("%s接了%d个客人%s\n",name,i,Thread.currentThread());

        }
    }
}
