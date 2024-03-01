package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {


	
	@GetMapping("/")
	public String success() {
		return "success";
	}

}
