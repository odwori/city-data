package com.citydata.form;


public class CityForm {
	private long id;
	
	private  String name; 
	
	private String description;
	
	private long numberOfCitizens;
	
	public CityForm() {}

	public CityForm(long id, String name, String description, long numberOfCitizens) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.numberOfCitizens = numberOfCitizens;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getNumberOfCitizens() {
		return numberOfCitizens;
	}

	public void setNumberOfCitizens(long numberOfCitizens) {
		this.numberOfCitizens = numberOfCitizens;
	}
	

}
