package com.mangodbproject.serviceimpl;

//import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangodbproject.Dto.Book;
import com.mangodbproject.feignclient.AddressFeignClient;
//import com.mangodbproject.feignclient.AddressFeignClient;
import com.mangodbproject.model.Distributor;
import com.mangodbproject.repository.DistributorRepository;
import com.mangodbproject.service.DistributorService;

@Service
public class DistributorServiceImpl implements DistributorService {

	@Autowired
	DistributorRepository distributorRepository;

	@Autowired
	AddressFeignClient addressFeignClient;

	@Override
	public Map<String, Object> saveDistributor(Distributor distributor) {
		Distributor existingdistributor = distributorRepository.save(distributor);
		Map<String, Object> map = new HashMap<>();
		if (existingdistributor != null) {
			map.put("msg", "Distributor added");
			map.put("Distrubutor", existingdistributor.getDistributorId());
		}
		return map;
	}
//	 Distributor existingdistributor = distributorRepository.save(distributor);
//	if(exis != null) {
//	existingdistributor.setLastUpdateDate(new Date());
//	if(distributor.getDistributorId() != null) {
//		existingdistributor.setDistributorId(distributor.getDistributorId());
//	if(distributor.get)	
//}

	@Override
	public List<Distributor> getAllDistributors() {

		return distributorRepository.findAll();
	}

	@Override
	public Map<String, Object> getDistributorById(String id) {
		Distributor dstr = distributorRepository.findById(id).get();
		Map<String, Object> map = new HashMap<>();
		map.put("DistributorName", dstr.getDistributorName());
		map.put("DOB", dstr.getDOB());
		map.put("Gender", dstr.getGender());
		map.put("CommunicationAddress", dstr.getCommunicationAddress());
		map.put("PermanentAddress", dstr.getPermanentAddress());
		map.put("Email", dstr.getEmail());
		map.put("PhoneNumber", dstr.getPhoneNumber());
		map.put("MobileNumber", dstr.getMobileNumber());
		map.put("GSTN", dstr.getGSTN());
		map.put("Aadhaar", dstr.getAadhaar());
		map.put("PAN", dstr.getPAN());
		map.put("BankAcctProof", dstr.getBankAcctProof());
		map.put("Status", dstr.getStatus());
		map.put("CreatedBy", dstr.getCreatedBy());
		map.put("LastUpdatedBy", dstr.getLastUpdatedBy());
		map.put("CreatedDate", dstr.getCreatedDate());
		map.put("LastUpdateDate", dstr.getCreatedDate());

//		List<Address> addreslistres = dstr.getAddress();
//		map.put("Array", addreslistres);

		return map;
	}

	@Override
	public Map<String, Object> updateDistributorDetails(Distributor distributor, String id) {
		Distributor dstr = distributorRepository.findById(id).get();
		Map<String, Object> map = new HashMap<>();
		if (dstr != null) {
			if (distributor.getDistributorId() != null)
				dstr.setDistributorId(distributor.getDistributorId());
			if (distributor.getDistributorName() != null)
				dstr.setDistributorName(distributor.getDistributorName());
			if (distributor.getDOB() != null)
				dstr.setDOB(distributor.getDOB());
			if (distributor.getGender() != null)
				dstr.setGender(distributor.getGender());
			if (distributor.getCommunicationAddress() != null)
				dstr.setCommunicationAddress(distributor.getCommunicationAddress());
			if (distributor.getPermanentAddress() != null)
				dstr.setPermanentAddress(distributor.getPermanentAddress());
			if (distributor.getEmail() != null)
				dstr.setEmail(distributor.getEmail());
			if (distributor.getPhoneNumber() != null)
				dstr.setPhoneNumber(distributor.getPhoneNumber());
			if (distributor.getMobileNumber() != null)
				dstr.setMobileNumber(distributor.getMobileNumber());
			if (distributor.getGSTN() != null)
				dstr.setGSTN(distributor.getGSTN());
			if (distributor.getAadhaar() != null)
				dstr.setAadhaar(distributor.getAadhaar());
			if (distributor.getPAN() != null)
				dstr.setPAN(distributor.getPAN());
			if (distributor.getBankAcctProof() != null)
				dstr.setBankAcctProof(distributor.getBankAcctProof());
			if (distributor.getStatus() != null)
				dstr.setStatus(distributor.getStatus());
			if (distributor.getCreatedBy() != null)
				dstr.setCreatedBy(distributor.getCreatedBy());
			if (distributor.getLastUpdatedBy() != null)
				dstr.setLastUpdatedBy(distributor.getLastUpdatedBy());
			if (distributor.getCreatedDate() != null)
				dstr.setCreatedDate(distributor.getCreatedDate());
			if (distributor.getLastUpdateDate() != null)
				dstr.setLastUpdateDate(distributor.getLastUpdateDate());
			distributorRepository.save(dstr);
			map.put("message", "address details updated successfully");
		}

		return map;
	}
//    @Override
//	public List<Distributor> findByName(String distributorName) {
//  
//
//		return distributorRepository.findByDistributorName(distributorName);
//	}
//	@Override
//	public List<Distributor> findByDistributorName(String distributorname) {
//		
//		return distributorRepository.findByDistributorName(distributorname);
//	}

	@Override
	public String saveupdateDistributor(Distributor distributor) {
		Optional<Distributor> dstr = distributorRepository.findByDistributorName(distributor.getDistributorName());
		if (dstr.isEmpty()) {
			distributorRepository.save(distributor);
			return "distributor saved successfully";
		}
//		else if (dstr.isPresent()) {
//			Optional<Distributor> dstr1 = distributorRepository.findByDistributorName(distributor.getDistributorName());
//			if(dstr1.isPresent()) {
//			distributorRepository.delete(distributor);
//			return "distributor deleted successfully";
//			}
//		}

		else {
			Distributor newdistributor = distributorRepository.findByDistributorName(distributor.getDistributorName())
					.get();

			newdistributor.setAadhaar(distributor.getAadhaar());
			newdistributor.setBankAcctProof(distributor.getBankAcctProof());
			newdistributor.setCommunicationAddress(distributor.getCommunicationAddress());
			newdistributor.setCreatedBy(distributor.getCreatedBy());
			newdistributor.setCreatedDate(distributor.getCreatedDate());
			newdistributor.setDistributorId(distributor.getDistributorId());
			newdistributor.setDistributorName(distributor.getDistributorName());
			newdistributor.setDOB(distributor.getDOB());
			newdistributor.setEmail(distributor.getEmail());
			newdistributor.setGender(distributor.getGender());
			newdistributor.setGSTN(distributor.getGSTN());
			newdistributor.setLastUpdateDate(distributor.getLastUpdateDate());
			newdistributor.setMobileNumber(distributor.getMobileNumber());
			newdistributor.setPAN(distributor.getPAN());
			newdistributor.setPermanentAddress(distributor.getPermanentAddress());
			newdistributor.setPhoneNumber(distributor.getPhoneNumber());
			newdistributor.setStatus(distributor.getStatus());
			newdistributor.setAddress(distributor.getAddress());
			distributorRepository.save(newdistributor);

			return "distributor updated successfully";
		}
//		else {
//			Optional<Distributor> newdistributor1 = distributorRepository.findByDistributorName(distributor.getDistributorName());
//			if(newdistributor1.isPresent()) {
//				distributorRepository.delete(distributor);
//			}
//			return "distributor deleted successfully";
//		}
//		

	}

	@Override
	public List<Book> getAllBooks() {
		return addressFeignClient.getAllBooks();
	}

	@Override
	public String DistributorByName(String distributorId, String distributorName) throws Exception {
		List<Distributor> distributors = distributorRepository.findByDistributorIdAndFullNameStartsWithIgnoreCase(distributorId,
				distributorName);
	  for (Distributor distributor : distributors) {
		  Distributor dist = new Distributor();
		  dist.setDistributorName(distributor.getDistributorName());
		  dist.setStatus(distributor.getStatus());
		  dist.setPhoneNumber(distributor.getPhoneNumber());
		  dist.setPermanentAddress(distributor.getPermanentAddress());
		  dist.setPAN(distributor.getPAN());
		  dist.setMobileNumber(distributor.getMobileNumber());
		  dist.setLastUpdatedBy(distributor.getLastUpdatedBy());
		  dist.setLastUpdateDate(distributor.getLastUpdateDate());
		  dist.setGSTN(distributor.getGSTN());
		  dist.setGender(distributor.getGender());
		  dist.setEmail(distributor.getEmail());
		  dist.setDOB(distributor.getDOB());
		  dist.setCreatedDate(distributor.getCreatedDate());
		  dist.setCreatedBy(distributor.getCreatedBy());
		  dist.setCommunicationAddress(distributor.getCommunicationAddress());
		  dist.setBankAcctProof(distributor.getBankAcctProof());
		  dist.setAadhaar(distributor.getAadhaar());
		 
		  
	  }
		
		
		return "successfully found with name";
		}

//	@Override
//	public void deleteAddress(String id) {
//		addressRepository.findById(id);
//		addressRepository.deleteById(id);
//		
//	}

}
