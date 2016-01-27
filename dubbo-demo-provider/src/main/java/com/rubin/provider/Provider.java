package com.rubin.provider;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by RubinCarter on 16-1-20.
 */
public class Provider {

//    private final static Logger LOGGER = LogManager.getLogger(Provider.class);

    private final static Logger LOGGER = LoggerFactory.getLogger(Provider.class);

    public static void main(String args[]) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml");
        context.start();
        LOGGER.error("start end", new NullPointerException());
        System.in.read();
    }

}
