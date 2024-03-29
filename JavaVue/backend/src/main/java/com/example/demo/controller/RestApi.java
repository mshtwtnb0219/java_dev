package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestApi {

	
	/**
	 * 文字列を返却するだけ
	 * @return
	 */
	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/text")
	public String getText() {
		
		return "hello";
	}
	
}
