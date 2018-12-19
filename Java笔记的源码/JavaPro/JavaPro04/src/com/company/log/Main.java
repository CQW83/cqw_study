package com.company.log;

import org.apache.log4j.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //日志管理
        //1.收集项目运行的问题
        //2.调试代码

        //打印会影响项目的执行，抢服务器的资源

        //日志框架
        //log4j


        //log4j的组成：
        //1.日志记录器：输出日志
        //2.输出端：指定日志输出的位置
        //3.日志格式化：控制日志输出的样式

        //方式1
        //创建日志记录器
        Logger logger = Logger.getLogger(Main.class);
        //日志格式
        //1.简单格式
        SimpleLayout simpleLayout =new SimpleLayout();
        //2.HTML格式
        HTMLLayout htmlLayout = new HTMLLayout();
        //3.自定义格式
        //https://www.yiibai.com/log4j/log4j_patternlayout.html
        PatternLayout patternLayout = new PatternLayout("%r [%t] %-5p %c - %m%n");
        //创建输出端
        //1.控制台
        ConsoleAppender consoleAppender = new ConsoleAppender(simpleLayout);
        logger.addAppender(consoleAppender);
        //2.文件
        FileAppender fileAppender = new FileAppender(htmlLayout,"log.html");
        logger.addAppender(fileAppender);
        //3.定期生成文件
        DailyRollingFileAppender dailyRollingFileAppender = new DailyRollingFileAppender(patternLayout,"log.txt","'.'yyy-MM-dd");
        logger.addAppender(dailyRollingFileAppender);


        //设置日志等级
        logger.setLevel(Level.DEBUG);
        //使用日志记录器打印日志
        logger.trace("123");
        logger.debug("123");
        logger.info("123");
        logger.warn("123");
        logger.error("123");
        logger.fatal("123");



    }
}
