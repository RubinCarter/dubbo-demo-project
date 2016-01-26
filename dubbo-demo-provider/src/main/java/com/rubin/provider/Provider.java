package com.rubin.provider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by RubinCarter on 16-1-20.
 */
public class Provider {

    private final static Logger LOGGER = LogManager.getLogger(Provider.class);

    public static void main(String args[]) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml");
        context.start();
        LOGGER.debug("start end");
        System.in.read();
    }

}
