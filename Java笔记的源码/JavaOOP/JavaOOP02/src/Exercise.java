import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.time.temporal.Temporal;
import java.util.Random;

public class Exercise {
    /**
     * 比大小
     * @param a 第一个值
     * @param b 第二个值
     * @return 返回最大值
     */
    public int Max(int a,int b){
        return  a >b ? a : b;
    }
    //return 的作用
    //1.用于返回值
    //2.跳出方法（return后的代码不会执行）
    public  int maxThree(int a ,int b ,int c){
       //return (a > b ? a : b) > c ? (a > b ? a : b):c;
        //调用本类中的方法
          return Max(Max(a,b),c);
    }
    public int maxFor(int a, int b ,int c ,int d){
        return Max(maxThree(a, b ,c),d);
    }
    public int[] change(int a[]) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\t",a[i]);
        }
        return a;
    }
    public void swapPoint(Point p1,Point p2){
        //交换横坐标
        int temp = p1.x ;
        p1.x = p2.x;
        p2.x = temp;
       //交换纵坐标
        temp = p1.y;
        p1.y = p2.y;
        p2.y = temp;
    }

    /**
     * 输出数组
     * @param a 接收一个数组
     */
    public void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\t",a[i]);
        }
    }

    /**
     * 生成随机数
     * @param a 接收一个数组
     * @param m 设置生成随机数的最小值
     * @param n 生成随机数的最大值
     */
    public void ran(int a[] ,int m ,int n) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
           a[i] = random.nextInt(n- m + 1)+m;
        }
    }

    /**
     * 对数组进行冒泡排序
     * @param input 控制数组排列顺序，0为升序，1为降序
     * @param a 要排序的数组
     * @return
     */
    public int[] maopao(int input , int a[]){
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - 1 - i; j++) {
                    if(input == 0) {
                        if (a[j] > a[j + 1]) {
                            int temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }else{
                        if (a[j] < a[j + 1]) {
                            int temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }
            }
        return a;
    }
    //n个数最大值
    public int arrayMax(int a[]){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            max = Max(max,a[i]);
        }
        return max;
    }
    //...代表可选参数，可以川，也可以不传，也可以传多个值 可选参数只能放在参数列表的最后
    //nums就是数组
    public  int maxNpro(int... nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public int sum (int... a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    //在一个类中，对于一系列具有相同功能的方法可以进行优化，方法调用时比较方便的
    //方法的重载
    //1.在一个类中
    //2.方法名相同
    //3.参数个数 或 参数类型不同

        //递归：在方法内部调用本身
        // 递归一定要有出口！！！
    /* public void test(){
         System.out.println("这是啥");
         test();
     }
     */

    public int sumPro(int n){
        if (n == 1){
            return 1;
        }else {
            return sumPro(n - 1) + n;
        }
    }

    public int sumF(int n){
        if (n == 1 || n == 2){
            return 1;
        }else{
            return sumF(n-1) + sumF(n-2);
        }
    }

    public void m (int i){
        if(i == 1){
            System.out.println("1x1=1\t");
        }else {
            m(i-1);
            for (int j = 1; j <= i; j++) {
                System.out.printf("%dx%d=%d\t", j, i, j * i);
            }
            System.out.println();
        }
    }
}
