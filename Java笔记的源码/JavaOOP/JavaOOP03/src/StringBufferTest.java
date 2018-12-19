import java.util.Scanner;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("这是一串字符串");
        //1.在后面追加字符串
        int a = 1;
        System.out.println(stringBuffer.append(a));
        //2.在指定位置删除
        System.out.println(stringBuffer.deleteCharAt(3));
        System.out.println(stringBuffer.delete(2,5));
        //3.在指定位置插入字符
        System.out.println(stringBuffer.insert(1,"插入"));
            //指定在开始第一个字符串的位置插入字符串，并可以规定要插入字符串的起始位置
        System.out.println(stringBuffer.insert(1,"字符",0,2));
        //4.反向打印
        System.out.println(stringBuffer.reverse());
        //5.修改指定位置的字符
        stringBuffer.setCharAt(1,'d');
        System.out.println(stringBuffer);
        //6.返回当前的容量
        System.out.println(stringBuffer.capacity());
        //7.查看一个字符出现的位置
        System.out.println(stringBuffer.indexOf("字"));
        //最后一次出现的位置
        System.out.println(stringBuffer.lastIndexOf("d"));
        //8.查看长度
        System.out.println(stringBuffer.length());
        //9.返回某段字符
        System.out.println(stringBuffer.subSequence(1,5));
        //10.返回从某个位置开始以后的字符
        System.out.println(stringBuffer.substring(1));
        System.out.println(stringBuffer.substring(1,3));
        //11.改变字符的存储？
       stringBuffer.trimToSize();
        System.out.println(stringBuffer);
    }
}
