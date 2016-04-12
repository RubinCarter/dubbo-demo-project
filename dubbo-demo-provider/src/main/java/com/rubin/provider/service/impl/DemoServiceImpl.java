package com.rubin.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.rubin.domain.City;
import com.rubin.mapper.CityMapper;
import com.rubin.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by RubinCarter on 16-1-20.
 */
@Service(version = "1.0")
public class DemoServiceImpl implements DemoService {

    private final CityMapper mapper;

    public City sayHello(City city) {
        city = mapper.selectCityByName(city.getName());
        return city;
    }

    @Transactional
    public void insertCity(City city) {
        mapper.insertCity(city);
        mapper.insertCity(city);
        if(true) {
            throw new RuntimeException("lll");
        }
    }

    @Autowired
    public DemoServiceImpl(final CityMapper mapper) {
        this.mapper = mapper;
    }

}
