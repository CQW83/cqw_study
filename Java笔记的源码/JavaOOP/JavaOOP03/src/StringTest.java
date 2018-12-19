import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        //final修饰的变量 ，变量内容不能改变
        final int a = 10;
        //final修饰变量，使用尖叫蛇形命名法。
        final int APPLE_COUNT = 10;
        //String:不可变字符串类,内容不可变，字符串由多个字符组成的

        //String常用方法
        //1.创建字符串对象
        String s1 = new String();
        String s2 = new String("abc");
        String s3 = "";
        String s4 = "abc";
        //2.字符串长度
        System.out.println(s1.length());
        //3.获取字符串中的字符
        System.out.println(s2.charAt(0));
        System.out.println(s2.charAt(1));
        System.out.println(s2.charAt(2));
        //练习：遍历字符串中的字符
        //4.字符串的比较
        //== 比较的是地址；equals比较的是内容
        System.out.println(s2.equals(s4));
        String s5 = "abc";
        System.out.println(s4 == s5);

        //5.字符串的转换(大小写)
        String s6 = "AbC";
        System.out.println(s6.toLowerCase());
        System.out.println(s5.toUpperCase());
        //5.字符串转字符数组
        System.out.println(s6.toCharArray());
        //6. 字符串包含
        System.out.println(s4.contains("ab"));
        System.out.println(s4.contains("ba"));
        //返回字符串出现的位置没有就返回-1
        String s7="曹操为什么欣赏关羽,因为关羽是第一个看到他就脸红的男人";
        //正查
        System.out.println(s7.indexOf("关羽"));
        System.out.println(s7.indexOf("嫂嫂"));
        //倒查
        System.out.println( s7.lastIndexOf("关羽"));

        System.out.println(s7.indexOf("关羽",8));
        //练习：获取字符串出现的次数
        //7.字符串的替换
        String s8 = "瘦是什么？刮风都要扶电线杆";
        String s9 =s8.replace("刮风","放屁");
        System.out.println(s9);
        //8.字符串的分割
        String s10 = "洪亮.avi";
        String[] strings=s10.split("\\.");
        System.out.println(Arrays.toString(strings));
        String s11 ="353980895@qq.com";
        String[] strings1 = s11.split("\\@|\\.");
        System.out.println(Arrays.toString(strings1));
        //9.转字符串
        //其他类型转字符串
        int a1  =10;
        String s12 = String.valueOf(a1);
        String s13 = a1+"";
        //字符串转其他类型
        String s14 = "123";
        int a2 = Integer.parseInt(s14);
        int a3 = Integer.valueOf(s14);
        //字符串数组 转 字符串
        String s = String.join(".",strings1);
        System.out.println(s);
        //10.字符串处理
        String s15 = "   哈  哈   哈    ";
        System.out.println(s15);
        System.out.println(s15.trim());
        //11.字符串判断
        System.out.println(s10.endsWith(".avi"));
        System.out.println(s10.startsWith("洪亮"));
        //12.字符串的截取
        String s16 ="哈财哈色哈";
        System.out.println(s16.substring(0, 1));
        System.out.println(s16.substring(1, 2));
        System.out.println(s16.substring(1));
        //13.比较字符串的大小
        String s17 ="1";
        String s18 = "2";
        System.out.println(s17.compareTo(s18));
        //14字符串首尾链接
        System.out.println(s11.concat(s12));

    }
}
