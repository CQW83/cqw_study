public class Phone {
    private double price = 2000;
    private String color = "红色";
    private String brand = "小米";

    public Phone() {

    }

    public Phone(double price, String color, String brand) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void action() {
        System.out.printf("这是%s牌子，%.2f元的%s的手机\n", getBrand(), getPrice(), getColor());
    }

    public void talk() {
        System.out.println("打电话");
    }

    public void send() {
        System.out.println("发信息");
    }
}
