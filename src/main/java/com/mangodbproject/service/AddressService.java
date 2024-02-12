package com.mangodbproject.service;

import java.util.List;
import java.util.Map;

import com.mangodbproject.model.Address;



public interface AddressService {

	
public Map<String,Object> saveAddress(Address address);
	
	public List<Address> getAllAddress();
	
	public Map<String,Object> getAddressById(String id);
	
	public Map<String,Object> updateAddressDetails(Address address,String id);
	
	public void deleteAddress(String id);
	
//	public List<Address> findAddressBycityAndstate(String City ,String State);
	
}
