package com.mangodbproject.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mangodbproject.model.Distributor;

public interface DistributorRepository extends MongoRepository<Distributor ,String>{

	Object delete = null;


	Optional<Distributor> findByDistributorName(String distributorName);


	Optional<Distributor> findByemail(Object email);


	Optional<Distributor> findByEmail(String distributorName);


	List<Distributor>findByDistributorIdAndFullNameStartsWithIgnoreCase(String distributor, String distributorName);
	



}
