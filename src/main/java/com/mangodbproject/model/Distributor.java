package com.mangodbproject.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;

@Data
@Document(collection = "distributor")
public class Distributor {

	@MongoId(FieldType.STRING)
	private String DistributorId;

	private String distributorName;

	private String DOB;

	private String Gender;

	private String CommunicationAddress;

	private String PermanentAddress;

	private String Email;

	private String PhoneNumber;

	private String MobileNumber;

	private String GSTN;

	private String Aadhaar;

	private String PAN;

	private String BankAcctProof;

	private String Status;

	private String CreatedBy;

	private String LastUpdatedBy;

	private String CreatedDate;

	private String LastUpdateDate;
	
	private List<Address> address;
	
	

}
