package com.rubin.webapp.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.rubin.bean.DemoBean;
import com.rubin.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by RubinCarter on 16-1-20.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Reference(version = "1.0")
    private DemoService demoService;

    @ResponseBody
    @RequestMapping("/sayHello")
    public DemoBean sayHello(String id) {
        DemoBean demoBean = demoService.sayHello(new DemoBean());
        return demoBean;
    }

    public void setDemoService(final DemoService demoService) {
        this.demoService = demoService;
    }

}
