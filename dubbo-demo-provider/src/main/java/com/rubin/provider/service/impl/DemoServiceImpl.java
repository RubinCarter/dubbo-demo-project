package com.rubin.provider.service.impl;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.rubin.domain.City;
import com.rubin.mapper.CityMapper;
import com.rubin.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by RubinCarter on 16-1-20.
 */
@Service(version = "1.0")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private CityMapper mapper;

    public City sayHello(City city) {
        city = mapper.selectCityByName(city.getName());
        return city;
    }

    public void setMapper(final CityMapper mapper) {
        this.mapper = mapper;
    }

}
