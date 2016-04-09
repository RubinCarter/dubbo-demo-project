package com.rubin.webapp;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Created by rubin on 16-4-9.
 */
@Configuration
public class DubboConfiguration {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig config = new ApplicationConfig();
        config.setName("dubbo-demo-webapp");
        config.setLogger("log4j2");
        return config;
    }

    @Bean
    public RegistryConfig registryConfig() {
        return new RegistryConfig("multicast://224.5.6.7:1234");
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        return new ProtocolConfig("dubbo", 20880);
    }

    @Bean
    public AnnotationBean annotationBean() {
        return new AnnotationBean();
    }

}
