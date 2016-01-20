package com.rubin.controller;


import com.rubin.bean.DemoBean;
import com.rubin.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by rubin on 16-1-20.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Resource(name = "demoService")
    private DemoService demoService;

    @ResponseBody
    @RequestMapping("/sayHello")
    public DemoBean sayHello(String id) {
        DemoBean demoBean = demoService.sayHello(new DemoBean(id));
        return demoBean;
    }

}
