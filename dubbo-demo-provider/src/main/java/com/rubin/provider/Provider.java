package com.rubin.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by RubinCarter on 16-1-20.
 */
public class Provider {

    public static void main(String args[]) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext-*.xml");
        context.start();
        System.in.read();
    }

}
