package com.rubin.service.impl;

import com.rubin.bean.DemoBean;
import com.rubin.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by RubinCarter on 16-1-20.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public DemoBean sayHello(DemoBean bean) {
        bean.setAge("23")
                .setName("rubin");
        return bean;
    }

}
