package com.country.co.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.country.co.model.country;
import com.country.co.repository.country_repo;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/v2/")
public class controller {
	
	
	@Autowired
	country_repo repo;
	
	
// returns list of countries 	
@GetMapping("/country_list")
public  ResponseEntity< List<country>>  get(){
		
List<country> country =repo.findAll();
return new  ResponseEntity< List<country>>(country,HttpStatus.OK);
		}


//delete a country by id when user request
@RequestMapping(value = "deletecountry/{id}", method = RequestMethod.DELETE)
@ResponseBody
public boolean deleteCountry(@PathVariable int id) {
	repo.deleteById(id);
	return true;
	
}



//create a new country object when user request
@RequestMapping(value = "create",method= { RequestMethod.POST})
public boolean createCountry(@RequestBody country country ) {
	
 repo.save(country);
	
return true;

}





@PutMapping("/update/{id}")
public country updatecountry(@PathVariable(value = "id")int id, 
		                                    @RequestBody country country ) {
	
	country coun = repo.findById(id).orElseThrow();
												
	coun.setName(country.getName());
	coun.setNum_of_cities(country.getNum_of_cities());
	
	country updatecountry =repo.save(coun);
	return country;
	
}



}
