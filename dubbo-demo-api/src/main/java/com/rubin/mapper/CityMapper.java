package com.rubin.mapper;

import com.rubin.domain.City;

/**
 * Created by rubin on 16-4-10.
 */
public interface CityMapper {

    City selectCityByName(String name);

    void insertCity(City city);

}
