package com.citydata.service;

import java.util.List;

import com.citydata.entity.City;

public interface CityService {
	
	public City save(City city); 
	
    public List<City> allCities();	

}
