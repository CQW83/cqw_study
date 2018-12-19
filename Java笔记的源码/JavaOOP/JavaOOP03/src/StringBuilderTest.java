import javax.xml.transform.Source;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("这是一个字符串");
        //1.后加上字符串之类
        StringBuilder sb1 =new StringBuilder("11");
        char[] cArr = new char[]{'t','u','t','o','r','i','a','l','s'};
        System.out.println(stringBuilder.append(sb1));
        System.out.println(sb1.append(1.2));
        //2.返回当前容量
        System.out.println(sb1.capacity());
        System.out.println(stringBuilder.capacity());
        //3.查找指定的位置
        System.out.println(stringBuilder.charAt(2));
        //4.删除指定位置
        System.out.println(stringBuilder.delete(2,4));
        System.out.println(stringBuilder.deleteCharAt(2));
        //5.复制到目标char类型的数组中
        stringBuilder.getChars(1,3,cArr,2);
        System.out.println(cArr);
        //6.查找出现
        System.out.println(stringBuilder.indexOf("字符"));
        System.out.println(stringBuilder.indexOf("1",3));
        System.out.println(stringBuilder.lastIndexOf("1"));
        //7.插入字符
        System.out.println(stringBuilder.insert(2,"en"));
        //8.查询长度
        System.out.println(sb1.length());
        System.out.println(stringBuilder.length());
        //9.指定位置替换成字符串类型
        String s = "额？";
        System.out.println(stringBuilder.replace(1,3,s));
        //10.反向输出
        System.out.println(stringBuilder.reverse());
        //11.指定一段输出
        System.out.println(stringBuilder.subSequence(1,4));
        //12.变成String类型
        String s1 =stringBuilder.toString();
        System.out.println(s1);
    }
}
