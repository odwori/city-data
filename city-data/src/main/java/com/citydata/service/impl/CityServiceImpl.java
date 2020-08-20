package com.citydata.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citydata.dao.CityDao;
import com.citydata.entity.City;
import com.citydata.service.CityService;

@Service(value = "cityService")
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;
	
	@Override
	public City save(City city) {
		return cityDao.save(city);
	}

	@Override
	public List<City> allCities() {
		List<City> list = new ArrayList<>();
		cityDao.findAll().forEach(list::add);
		return list;
	}
	


}
