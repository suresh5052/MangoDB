 package com.mangodbproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mangodbproject.Dto.Book;
import com.mangodbproject.model.Distributor;
import com.mangodbproject.repository.DistributorRepository;
import com.mangodbproject.service.DistributorService;

@RestController
@RequestMapping("/api/dstr")
public class DistributorController {

	@Autowired
	DistributorService distributorService;
	
	@Autowired
	 DistributorRepository distributorRepository;
	

	

//	@PostMapping("/savedistributor")
//	public ResponseEntity<?> saveDistributor(@RequestBody Distributor distibutor) {
//		
//		return new ResponseEntity<>(distributorService.saveDistributor(distibutor), HttpStatus.CREATED);
//	}
	
	@GetMapping("/getAllBooks")
	 public List<Book> getAllBooks(){
		return distributorService.getAllBooks();
	}
	
   
	@GetMapping("/getAllDistributors")
	public List<Distributor> getAllDistributors(){
		
		return distributorService.getAllDistributors();
		
	}
	@GetMapping("/getDistributorById/{id}")
	public ResponseEntity<?>getDistributorById(@PathVariable String id){
		
		return new ResponseEntity<>(distributorService.getDistributorById(id),HttpStatus.OK);
		
	}
	
	@PutMapping("/updateDistributorDetails/{id}")
	public ResponseEntity<?> updateDistributorDetails(@RequestBody Distributor distributor,@PathVariable String id){
		
		return new ResponseEntity<>(distributorService.updateDistributorDetails(distributor, id), HttpStatus.OK);
	}
	
//	@GetMapping("/getDistributorByName")
//	public List<Distributor> getDistributorByName(@RequestBody String distributorname){
//		return distributorService.findByDistributorName(distributorname);
//	}
	
	
	@PostMapping("/saveupadateDistributorByName")
	public ResponseEntity<?> saveupdateDistributor(@RequestBody Distributor distributor){
		
		return new ResponseEntity<>(distributorService.saveupdateDistributor(distributor), HttpStatus.CREATED);
		
	}

}
