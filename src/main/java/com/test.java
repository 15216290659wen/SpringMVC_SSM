package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZHIWEN on 2017/9/11.
 */
public class test {
    //定义一个全局的记录器，通过LoggerFactory获取
   private final static Logger logger = LoggerFactory.getLogger(test.class);

   public static void main(String[] args) {
   logger.info("logback 成功了");
   logger.error("logback 成功了");
   logger.debug("logback 成功了");

   }

}
