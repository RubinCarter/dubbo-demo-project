package com.rubin.webapp.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.rubin.domain.City;
import com.rubin.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public City sayHello(String id) {
        City city = new City();
        city.setName("Rubin");
        city =  demoService.sayHello(city);
        return city;
    }

    @ResponseBody
    @RequestMapping("/insertCity")
    public String insertCity() {
        City city = new City();
        city.setName("bin");
        city.setCountry("Cn");
        city.setState("2");
        demoService.insertCity(city);
        return "true";
    }

    public void setDemoService(final DemoService demoService) {
        this.demoService = demoService;
    }

}
