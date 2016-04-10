package com.rubin.provider.service.impl;

import com.rubin.domain.City;
import com.rubin.mapper.CityMapper;
import com.rubin.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by RubinCarter on 16-1-20.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private CityMapper mapper;

    public City sayHello(City city) {
        city = mapper.selectCityByName(city.getName());
        return city;
    }

    @Transactional
    public void insertCity(City city) {
        mapper.insertCity(city);
        mapper.insertCity(city);
        /*if(true) {
            throw new RuntimeException("lll");
        }*/
    }

//    @Autowired
//    public DemoServiceImpl(final CityMapper mapper) {
//        this.mapper = mapper;
//    }

    public void setMapper(final CityMapper mapper) {
        this.mapper = mapper;
    }
}
