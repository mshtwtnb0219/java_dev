package com.example.demo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Inquiry {
	
	
	// 必須入力、文字列が60文字まで
	@NotBlank
	@Size(max=60)
	private String name;

	
	@NotBlank
	@Email
	private String email;
	
	
	
	

	
	


}
