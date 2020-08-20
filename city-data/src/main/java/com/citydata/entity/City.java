package com.citydata.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="CITY")
public class City {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@Column(name="NAME", nullable=false)
	private  String name; 
	
	@Column(name="DESCRIPTION", nullable=false)
	private String description;
	
	@Column(name="NUMBER_OF_CITIZENS", nullable=false)
	private long numberOfCitizens;
	
	@Column(name="CREATION_DATE", nullable=false)
	private LocalDateTime creationDate;
	
	public City() {}

	public City(String name, String description, long numberOfCitizens, LocalDateTime creationDate) {
		super();
		
		this.name = name;
		this.description = description;
		this.numberOfCitizens = numberOfCitizens;
		this.creationDate = creationDate;
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

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	

}
