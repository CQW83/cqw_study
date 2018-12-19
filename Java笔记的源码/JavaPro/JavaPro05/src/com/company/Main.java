package com.company;

import com.alibaba.fastjson.JSON;
import org.dom4j.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //数据格式：xml和json

        // xml:可扩展性标记语言
       /*
         xml的特点：
        1.文档声明必须放在第一行
        2.标签是自定义的
        3.xml文档中包含多个元素，
        4.元素有开始标签<age>，结束标签</age>，内容组成：
            a.双标签元素  <username>张三</username>
            b.单标签元素  <age/>
          根据元素包含关系分为：
            a.父元素
            b.子元素
            c.根元素:没有父元素的元素
            d.叶子元素：没有子元素的元素
            e.兄弟元素：同级的元素
         5.一个xml文档中只能有一个根元素
         6.可以在开始标签中添加多个属性
         7.一个元素的属性名不能重复
        */

        //称号        名字          武器
        //雷神        托尔          雷神之锤
        //钢铁侠      托尼斯塔克    盔甲
        //美国队长    斯蒂芬        盾牌

        //json:js对象语法

        //json结构特点：
        //1.没有注释
        //2.有两种结构{}代表对象，[]代表数组
        //3.{}中可以有多个属性，多个属性由逗号隔开
        //4.[]中可以有多个元素，多个元素用逗号隔开

        //解析（decode）：从xml或json中把数据提取出来
        //编码（encode）：把数据转成xml或者json

        //xml:dom4j
        //json:fastjson
        //xmlDecode();
        //xmlEncode();
        //jsonEncode();
        //jsonDecode();
        //testXpath();


        //xml的方式：
        //1.sax解析：逐行解析
        //特点：读一行解析一行;省系统资源;xml格式出现错误，错误之前的内容都可以解析
        //2.dom解析：全文解析
        //特点：把整个文档读完再解析;占用的内存会比较多，xml的格式出现错误，不在进行解析;形成文档结构模型，使用xpath技术

    }

    static void xmlDecode() {
        //从xml字符串中提取数据
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><heroes><hero><nickname>雷神</nickname><name>托尔</name><weapon>雷神之锤</weapon></hero><hero><nickname>钢铁侠</nickname><name>托尼斯塔克</name><weapon>盔甲</weapon></hero><hero><nickname>美国队长</nickname><name>斯蒂芬</name><weapon>盾牌</weapon></hero></heroes>";

        try {
            //解析xml字符串，形成文档模型
            Document document = DocumentHelper.parseText(xmlString);
            //获取文档的根元素
            Element rootElement = document.getRootElement();
            //System.out.println(rootElement);
            //获取元素名
           // System.out.println(rootElement.getName());
            //获取元素内容(不包含标签和子元素的文本信息)
            //System.out.println(rootElement.getText());
            //获取元素内容(不包含标签)
           // System.out.println(rootElement.getStringValue());
            //获取元素的子元素
            // System.out.println(rootElement.element("hero"));
            // System.out.println(rootElement.elements("hero"));
            List<Element> elementList = rootElement.elements("hero");
            ArrayList<Hero> heroArrayList = new ArrayList<>();
            //遍历3个hero元素
            for (Element heroElement : elementList) {
               /*

                Element nicknameElement = heroElement.element("nickname");
                Element nameElement = heroElement.element("name");
                Element weaponElement = heroElement.element("weapon");

                String name = nameElement.getText();
                String nickname = nicknameElement.getStringValue();
                String weapon = weaponElement.getTextTrim();

                */

                String nickname = heroElement.elementText("nickname");
                String name = heroElement.elementTextTrim("name");
                String weapon = heroElement.elementTextTrim("weapon");
                System.out.println(nickname);
                System.out.println(name);
                System.out.println(weapon);
                Hero hero = new Hero(nickname, name, weapon);
                heroArrayList.add(hero);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    static void xmlEncode() {
        ArrayList<Hero> heroArrayList = new ArrayList<>();
        heroArrayList.add(new Hero("诗仙", "李白", "青莲剑"));
        heroArrayList.add(new Hero("二郎神", "杨戬", "三尖两刃刀"));
        heroArrayList.add(new Hero("混世魔王", "程咬金", "斧子"));
        System.out.println(heroArrayList);

        //创建文档模型
        Document document = DocumentHelper.createDocument();

        //添加根元素
        Element rootElement = document.addElement("heroes");
        for (Hero hero : heroArrayList) {
            Element hero1 = rootElement.addElement("hero");
            hero1.addElement("nickname").addText(hero.getNickname());
            hero1.addElement("name").addText(hero.getName());
            hero1.addElement("weapon").addText(hero.getWeapon());
        }
        //获取文档模型内容
        String xmlString = document.asXML();
        System.out.println(xmlString);

    }

    static void jsonDecode() {
        String jsonString = "[{\"nickname\":\"雷神\",\"name\":\"托尔\",\"weapon\":\"雷神之锤\"},{\"nickname\":\"钢铁侠\",\"name\":\"托尼斯塔克\",\"weapon\":\"盔甲\"},{\"nickname\":\"美国队长\",\"name\":\"斯蒂芬\",\"weapon\":\"盾牌\"}]";
        //json的解析
        //最外层是[]，使用parseArray
        //JSON.parseArray()
        //最外层是{}，使用parseObject
        //JSON.parseObject()
        List<Hero> heroList = JSON.parseArray(jsonString, Hero.class);
        System.out.println(heroList);
    }

    static void jsonEncode() {
        ArrayList<Hero> heroArrayList = new ArrayList<>();
        heroArrayList.add(new Hero("诗仙", "李白", "青莲剑"));
        heroArrayList.add(new Hero("二郎神", "杨戬", "三尖两刃刀"));
        heroArrayList.add(new Hero("混世魔王", "程咬金", "斧子"));
        String jsonString = JSON.toJSONString(heroArrayList);
        System.out.println(jsonString);
    }

    static void testXpath(){
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><heroes><hero><nickname>雷神</nickname><name>托尔</name><weapon>雷神之锤</weapon></hero><hero><nickname>钢铁侠</nickname><name>托尼斯塔克</name><weapon>盔甲</weapon></hero><hero><nickname>美国队长</nickname><name>斯蒂芬</name><weapon>盾牌</weapon></hero></heroes>";
        //dom4j中使用xpath技术，需要导入jaxen-1.1.6.jar
        try {
            Document document = DocumentHelper.parseText(xmlString);
            //通过xpath技术获取元素
            //document.selectNodes()
            //document.selectSingleNode()

            //获取英雄的名字
            List<Node> nodeList = document.selectNodes("//hero/name");
            for (Node node : nodeList) {
                String text = node.getText();
                System.out.println(text);
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
