package com.citydata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citydata.entity.City;
import com.citydata.service.CityService;

@RestController
@RequestMapping("/api")
public class CityController {
	  @Autowired
	    private CityService cityService;

	    @RequestMapping(value="city/cities", method = RequestMethod.GET)
	    public List<City> listUser(){
	        return cityService.allCities();
	    }

	    @RequestMapping(value = "/secure/city", method = RequestMethod.POST)
	    public City create(@RequestBody City city){
	        return cityService.save(city);
	    }

}
