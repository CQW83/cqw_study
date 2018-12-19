package com;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Map接口下的方法

        //Map中的元素以"键值对"(Key-Value)的形式出现
        Map<Integer, String> map = new HashMap();
        //当Key值不存在时向Map中添加元素（键值对）
        //Key是唯一的，value是可重覆的
        //1001是键 ，key(不能重复)
        //张三是值 value
        map.put(1001, "张三");
        map.put(1008, "李四");
        map.put(1003, "王麻子");
        //当Key存在时，修改键对应的值
        map.put(1004, "王麻子");
        System.out.println(map);
        System.out.println(map.size());

        //判断是否包含某个key
        System.out.println(map.containsKey(1001));
        System.out.println(map.containsKey(1002));

        //判断是否包含value
        System.out.println(map.containsValue("王麻子"));
        System.out.println(map.containsValue("小名"));

        //根据key获取value
        System.out.println(map.get(1001));
        System.out.println(map.get(1002));

        //获取map中的所有key
        System.out.println(map.keySet());

        //获取map中所有的value
        System.out.println(map.values());
        //获取所有的键值对
        System.out.println(map.entrySet());

        //根据key值删除元素
        map.remove(1001);
        map.remove(1002);
        System.out.println(map);
        System.out.println(map.size());

        //遍历map
        for (Integer key : map.keySet()) {
            System.out.printf("%d - %s\n", key, map.get(key));
        }
        for (Iterator<Integer> iterator = map.keySet().iterator(); iterator.hasNext(); ) {
            Integer key = iterator.next();
            System.out.printf("%d - %s\n", key, map.get(key));
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%d - %s\n", key, map.get(key));
        }

        for (Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%d - %s\n", key, map.get(key));
        }
    /*
        数据结构：数据在计算机里的存储方式
        1.数组：在内存中是连续存储的 比如ArrayList
            特点：查找快，增删慢，需要使用连续的空间，
                  大量使用数组这种结构，容易产生内存碎片，
                  不适合存大量数据

        2.链表：在内存中不连续存储的，比如LinkedList
            特点：查找慢，增删快，可以使用不连续的内存，
                  适合存大量的数据，双向链表的查找效率要比单向列表高

        3.栈：特点：
                    先进后出（FILO），比如：Stack
                    入栈：把数据存入栈中
                    出栈：把数据从栈中取出
                    栈分了栈顶和栈底，所有的操作只能在栈顶进行

        4.队列：特点：
                    先进先出，比如（FIFO），比如Queue
                    队列分为对头和队尾，在队尾可以添加数据，在队头可以删除元素数据
    */
    /*
        接口类的选择：
             1.元素是否是键值对 是，Map
             2.不是，元素是否重复  否，Set
             3.其余选择 List
         Map实现类的选择：
             1.有次序，并且可以排序，选择TreeMap
             2.有次序但不能排序，选择linkedHashMap
             3.其他选择HashMap（线程不安全，效率高） 或 HashTable（线程安全，效率低）
         Set实现类的选择：
             1.有次序，并且可以排序，选择TreeSet
             2.有次序但不能排序，选择linkedTreeSet
             3.其他选择HashSet
         List实现类的选择：
             1.存储大量的数据，经常增加或删除，选LinkedList
             2.模拟栈的结构，选择Stack
             3.其他选择ArrayList（线程不安全，效率高）或Vector（线程安全，效率低）

         工作中常用：ArrayList,HashMap,HashSet
    */

        //数组的工具类 Arrays
            int[] a = {1,2,1,3,4,5};
            //数组转字符串
        System.out.println(a);
        //Arrays.toString(一维数组)
        System.out.println(Arrays.toString(a));
        //Arrays.deepToString(二维数组)
        // System.out.println(Arrays.deepToString(a));

        // 数组排序(升序)
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Comparator<Integer> comparator = new MyRule<>();
        Integer[] b = {1,2,1,3,4,5};
        Arrays.sort(b,comparator);
        System.out.println(Arrays.toString(b));

        //二分法（折半查找法）
        //前提：数组升序的
        int i = Arrays.binarySearch(a, 4);
        System.out.println(i);

        //数组转集合
        List<String> strings = Arrays.asList("哈哈", "呵呵", "嘻嘻");
        System.out.println(strings);

        //向数组填充数据
        int c[]= new int[10];
        Arrays.fill(c,666);
        System.out.println(Arrays.toString(c));

    /*    Random random = new Random();
        String[] strings = {"翠花1","翠花2","翠花3","翠花4","翠花5","翠花6","翠花7","翠花8","翠花9","翠花10"};
        Girl[] girls =new Girl[10];
        for (int i = 0; i < strings.length; i++) {
            Girl girl = new Girl(strings[i],random.nextInt(20 - 10 + 1)+10,random.nextInt(180-150 +1)+150);
            girls[i] = girl;
        }
        System.out.println(Arrays.toString(girls));
        System.out.println("排序后");
        Comparator<Girl> comparator1 = new GirlRule<>();
        Arrays.sort(girls,comparator1);
        System.out.println(Arrays.toString(girls));

        */
        //集合的工具类:Collectios
        ArrayList<String> arrayList = new ArrayList<>();
        //向集合中添加元素
        Collections.addAll(arrayList,"张四","李四","王麻子","李四");
        System.out.println(arrayList);
        //反向指定元素顺序
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        //指定某个位置的元素进行替换
        Collections.replaceAll(arrayList,"李四","替换");
        System.out.println(arrayList);
        //生成空的Set List Map
        List<Object> emptyList = Collections.emptyList();
        Map<Object, Object> emptyMap = Collections.emptyMap();
        Set<Object> set = Collections.emptySet();
        System.out.println(arrayList);
        //加入多个元素
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1,10,20,15,18,29,26);
        System.out.println(set1);
        //比大小
        Integer max =Collections.max(set1);
        Integer min = Collections.min(set1);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        //集合轮换
        System.out.println(arrayList);
        Collections.rotate(arrayList,1);
        System.out.println(arrayList);
        //交换两个元素的位置
        Collections.swap(arrayList,0,1);
        System.out.println(arrayList);

        //打乱集合中元素
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        /*
        list中的元素是任意类型
        static void test(List list) {
            System.out.println(list);
        }
         list中的元素是任意类型
        static void test(List<?> list) {
            System.out.println(list);
        }
        lis中的元素是Girl或Girl的子类
        static void test(List<? extends Girl> list) {
            System.out.println(list);
        }
        lis中的元素是Girl或Girl的父类
        static void test(List<? super Girl> list) {
            System.out.println(list);
        }
        */
    }
}
