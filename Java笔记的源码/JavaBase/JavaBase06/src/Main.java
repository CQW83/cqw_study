import javafx.scene.control.RadioMenuItem;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //多维数组：把数组当成元素放到另外一个数组中
        //一维数组
        //  int[] a1 = {1, 2, 3};
        //  int[] b1 = {4, 5, 6};
        //二维数组
        //静态初始化
        // int[][] c1 = {a1, b1};
        // int[][] c2 ={{1, 2, 3}, {4, 5, 6}};
        //  System.out.println(c1.length);
        // System.out.println(c2.length);
        //遍历数组
      /*  for (int i = 0; i < c2.length ; i++) {
            for (int j = 0; j < c2[i].length ; j++) {
                System.out.printf("%d\t",c2[i][j]);
            }
            System.out.println();
        }
        */
      /*  //动态初始化
        int[][] c3 = new int[2][3];
        //遍历数组
        Random random = new Random();
        //控制行
        for (int i = 0; i < c3.length; i++) {
            //控制列
            for (int j = 0; j < c3[i].length; j++) {
                c3[i][j] = random.nextInt(9 - 1 +1)+1;
            }
        }
        System.out.println(Arrays.deepToString(c3));
        //控制行
        for (int j = 0; j < 3; j++) {
            //控制列
            for (int i = 0; i < 2; i++) {
                c3[i][j] = random.nextInt(9 - 1 +1)+1;
            }
        }
        */
     /* int[][] a = new int[3][4];
      Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               a[i][j] = random.nextInt(99 - 10 + 1)+10;
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(a));
        for (int j = 0; j < a[0].length; j++) {
                for (int i = 0; i < a.length; i++) {
                System.out.printf("%d\t",a[i][j]);
               }
            System.out.println();
        }
    */
  /*  int[][] a = new int[3][5];
     int[][] b = new int[3][5];
     int[][] c = new int[3][5];
      Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(5 - 1 + 1) + 1;
                b[i][j] = random.nextInt(5 - 1 + 1) + 1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
              System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j] ;
                System.out.print(c[i][j]+"\t" );
            }
            System.out.println();
        }
        */
        int[][] a = new int[6][8];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(20 - 10 + 1) + 10;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == 2) {
                    System.out.print(a[i][j] + "\t");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 4) {
                    System.out.print(a[i][j] + "\t");
                }
            }
        }
    }
}
