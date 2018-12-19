package com.company.log;

import org.apache.log4j.Logger;

public class Pro {
    public static void main(String[] args) {
        //方法2
        Logger logger = Logger.getLogger(Pro.class);
        logger.debug("哈哈");
        logger.info("哈哈");
        logger.warn("哈哈");
        logger.error("哈哈");



    }
}
