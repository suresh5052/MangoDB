package com.mangodbproject.repository;

//import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;

import com.mangodbproject.model.Address;

public interface AddressRepository extends MongoRepository<Address, String>{

 
	
}
