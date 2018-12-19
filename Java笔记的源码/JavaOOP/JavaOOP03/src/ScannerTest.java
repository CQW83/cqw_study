import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        //1.输入的字符串能加空格
//        String s= scanner.nextLine();
//        System.out.println(s);
//        //2.输入的字符串不可以加空
//        s = scanner.next();
//        System.out.println(s);
        //3.判断输入的类型是否相符
         // System.out.println(scanner.hasNextBigInteger());
          //4.重置
            //scanner.reset();
            //5.返回默认基数
           // scanner.radix();
        //6.跳过指定的字符串
          scanner.skip("123");

        //关闭输入 只能放在末尾不然下面的扫描犯法是打不开的
        scanner.close();
    }
}
