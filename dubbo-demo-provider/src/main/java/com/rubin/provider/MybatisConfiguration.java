package com.rubin.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rubin on 16-4-10.
 */
@Configuration
@MapperScan(basePackages = "com.rubin.mapper")
public class MybatisConfiguration {



}
