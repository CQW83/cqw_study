import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //while循环
      /*
            while (条件表达式){
                语句
            }
        执行顺序：先计算条件表达式的结果，如果为ture，执行语句，false 循环结束

        do...while循环
        do {
            语句
        } while (条件表达式);
        执行顺序：先执行语句，在计算条件表达式，如果为ture 执行语句，如果为false 循环结束；

        循环的选择
            1.知道循环的次数，用for循环。
            2.知道循环的条件，使用while循环和do...while循环
            3.do...while循环至少执行一次循环体。

        结束循环：
            braeak 跳出本层循环
            continue 跳过本次循环

      int i = 0;
        while (i <= 100){
            System.out.println(i);
            i += 2;
        }

        Random random = new Random();
        int i = 0; int max = 10; int min =18;
        while (i <= 10){
            int number = random.nextInt(9) + 10;
            if(max < number){
                max = number;
            }
            if(min > number){
                min = number;
        }

            i++;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        // 50的阶乘
        BigInteger number = new BigInteger("1");
        for (int i = 2; i <= 50; i++) {
            number = number.multiply(new BigInteger(i + ""));
        }
        System.out.println("number = " + number);



        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        while (num != 0){
            num /= 10;
            i++;
        }
        System.out.println("是"+ i +"位数" );
          */


      //数组：用于存储相"同数据类型"数据的"有序"集合
        //数组的定义
        //格式
        //1.动态初始化 数据类型[] 数组名 = new 数据类型[元素个数];
      //  int [] array1 = new int[10];
        //2.静态初始化 数据类型[] 数组名 = {元素1，元素2，.....};
      //  int [] array2 = {1,2,3,4,5};
        //知道元素个数，使用动态初始化
        //知道确切的值，使用静态初始化

        //动态初始化数组，数组的元素有默认的值
        //1.byte ，short， int,long:0
        //2.float,double :0.0
        //3.char: '\u0000'
        //4.boolean: false
        //5.引用类型 ：null

        //数组的使用：
        //1.获取数字的元素个数
            //格式：数字名.length
      /*  int length = array1.length;
        System.out.println("length = " + length);
        System.out.println(array2.length);
        */
        //2.获取数字的元素
            //格式：数组名[索引/下标]
            //下标范围 [0，length - 1]
        //遍历数组
      /*  for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        */
        //3.修改数组的元素
            //格式 array[下标] = 值
    /*
        Random random =new Random();
        for (int i = 0; i < array1.length; i++) {
            array1 [i] = random.nextInt(36)+10;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.printf(array1[i] + "\t");
        }
        System.out.println(Arrays.toString(array1));

        Random random =new Random();
        int [] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5)+6;
        }
        int max = 6;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i <array.length ; i++) {
            if( array[i] == max){
                System.out.println(i);
            }
        }
    */
/*
    //数组排序
        //1.冒泡排序
        int[] array = {5,2,4,3,1};
        //外层循环控制比较趟数。
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环控制次数
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        int[] a = new int[10];
        Random random = new Random();
        for (int i = 0; i < a.length ; i++) {
            a[i] = random.nextInt(99 - 66 + 1) + 66;
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] >= a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
          */

    }
}
