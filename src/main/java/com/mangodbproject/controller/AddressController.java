package com.mangodbproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mangodbproject.model.Address;
import com.mangodbproject.service.AddressService;



@RestController
@RequestMapping("/api/adrs")
public class AddressController {

	
	
	@Autowired
	 AddressService addressService;
	
	@PostMapping("/saveaddress")
	public ResponseEntity<?>saveAddress(@RequestBody Address address){
		return new ResponseEntity<>(addressService.saveAddress(address), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllAddress")
	public List<Address> getAllAddress(){
		return addressService.getAllAddress();
		
	}
	@GetMapping("/getAddressById/{id}")
	public ResponseEntity<?>getAddressById(@PathVariable String id){
		return new ResponseEntity<>(addressService.getAddressById(id),HttpStatus.OK);
		
	}
	
	@PutMapping("/updateaddressDetails/{id}")
	public ResponseEntity<?> updateAddressDetails(@RequestBody Address address,@PathVariable String id){
		return new ResponseEntity<>(addressService.updateAddressDetails(address, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteAddress(@PathVariable("id") String id){
		return new ResponseEntity<>("Address deleted successfully", HttpStatus.OK);
		
	}
//	@GetMapping("/{citystate}")
//	public List<Address> findAddressBycityAndstate(@PathVariable String city, @PathVariable String state){
//		return addressService.findAddressBycityAndstate(city, state);
//	}
	
}
