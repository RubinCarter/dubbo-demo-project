package com.rubin.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Created by rubin on 16-4-9.
 */
@Configuration
@ComponentScan(basePackages = "com.rubin.provider.service.impl", includeFilters = {
        @ComponentScan.Filter(classes = com.alibaba.dubbo.config.annotation.Service.class, type = FilterType.ANNOTATION)
})
public class DubboConfiguration {

    @Bean
    public static ApplicationConfig applicationConfig() {
        ApplicationConfig config = new ApplicationConfig();
        config.setName("dubbo-demo-provider");
        config.setLogger("log4j2");
        return config;
    }

    @Bean
    public static RegistryConfig registryConfig() {
        return new RegistryConfig("multicast://224.5.6.7:1234");
    }

    @Bean
    public static ProtocolConfig protocolConfig() {
        return new ProtocolConfig("dubbo", 20880);
    }

    @Bean
    public static AnnotationBean annotationBean() {
        return new AnnotationBean();
    }

}
