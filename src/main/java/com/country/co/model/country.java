package com.country.co.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class country {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int num_of_cities;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum_of_cities() {
		return num_of_cities;
	}
	public void setNum_of_cities(int num_of_cities) {
		this.num_of_cities = num_of_cities;
	}
	
	
	
	
	

}
