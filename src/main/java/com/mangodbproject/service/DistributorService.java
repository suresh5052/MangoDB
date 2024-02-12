package com.mangodbproject.service;

import java.util.List;
import java.util.Map;

import com.mangodbproject.Dto.Book;
import com.mangodbproject.model.Distributor;

public interface DistributorService {

	public Map<String, Object> saveDistributor(Distributor distributor);

	public List<Distributor> getAllDistributors();

	public Map<String, Object> getDistributorById(String id);

	public Map<String, Object> updateDistributorDetails(Distributor distributor, String id);
//
//	List<Distributor> findByName(String distributorName);
//
//	public List<Distributor> findByDistributorName(String distributorname);

//public List<Distributor> findByName(String name);
	public String saveupdateDistributor(Distributor distributor);

	public List<Book> getAllBooks();
	
	public String DistributorByName(String distributorId, String distributorName)throws Exception;

}
