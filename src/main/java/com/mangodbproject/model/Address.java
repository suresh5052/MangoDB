package com.mangodbproject.model;



import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
//import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Address {

@MongoId(FieldType.STRING)
private String id;

@NotEmpty
private String addressLine1; 

@NotEmpty
private String addressLine2;

@NotEmpty
private String city;

@NotEmpty
private String state;

@NotEmpty
@Size(min =6 , message = "Address pincode should have atleast 6 digits")
private String pincode;
	
}
