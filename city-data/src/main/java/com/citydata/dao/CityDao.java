package com.citydata.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citydata.entity.City;

@Repository
public interface CityDao  extends CrudRepository<City, Long> {

}
