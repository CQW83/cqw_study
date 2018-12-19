import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random  random =new Random();
        //1.生成随机数
        System.out.println(random.nextBoolean());
        System.out.println(random.doubles());

    }
}
