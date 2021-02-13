package com.country.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.co.model.country;
import com.country.co.repository.country_repo;



@Service
public class country_serviceIMPL implements country_service {

	@Autowired
	country_repo repo;
	
	
	
	
	@Override
	public List<country> findall() {
		
		return  repo.findAll();
	}

	@Override
	public void delete_country(int id) {
		// TODO Auto-generated method stub
	 repo.deleteById(id);;
	}

	@Override
	public int country_update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void  create_country(country country) {
		// TODO Auto-generated method stub
	 repo.save(country);
	}

}
