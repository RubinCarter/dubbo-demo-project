package com.rubin.provider;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.rubin.service.DemoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

/**
 * Created by RubinCarter on 16-1-20.
 */
@SpringBootApplication(scanBasePackages = "com.rubin")
public class ApplicationContext {

    private final static Logger LOGGER = LoggerFactory.getLogger(ApplicationContext.class);

    public static void main(String args[]) throws IOException {
        final ConfigurableApplicationContext context = SpringApplication.run(ApplicationContext.class, args);
        System.out.println(context.getBean(DemoService.class));
        synchronized (ApplicationContext.class) {
            try{
                ApplicationContext.class.wait();
            }catch(Exception e) {}
        }
    }

}
