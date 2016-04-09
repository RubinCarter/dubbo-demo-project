package com.rubin.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.rubin.bean.DemoBean;
import com.rubin.service.DemoService;

/**
 * Created by RubinCarter on 16-1-20.
 */
@Service(version = "1.0")
public class DemoServiceImpl implements DemoService {

    public DemoBean sayHello(DemoBean bean) {
        bean.setAge("23");
        bean.setName("rubin");
        return bean;
    }

}
