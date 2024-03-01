package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Task {


	
	@Id
	@GeneratedValue
	private Integer id;
	
	  private Integer location_id;
	  
	  private String name;
	  
	  private Integer temperature;
	  
	  private Integer humidity;
	  
	

}
