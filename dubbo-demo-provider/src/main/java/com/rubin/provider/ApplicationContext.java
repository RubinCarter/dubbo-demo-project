package com.rubin.provider;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Created by RubinCarter on 16-1-20.
 */
@SpringBootApplication
public class ApplicationContext {

    private final static Logger LOGGER = LoggerFactory.getLogger(ApplicationContext.class);

    public static void main(String args[]) throws IOException {
        SpringApplication.run(ApplicationContext.class, args);
        synchronized (ApplicationContext.class) {
            try{
                ApplicationContext.class.wait();
            }catch(Exception e) {}
        }
    }

}
