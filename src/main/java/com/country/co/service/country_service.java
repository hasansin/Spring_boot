package com.country.co.service;

import java.util.List;

import com.country.co.model.country;

public interface country_service {
	
	List<country> findall();
	void delete_country(int id);
	int country_update(int id);
	void create_country(country country);
	

}
