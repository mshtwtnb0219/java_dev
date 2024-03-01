package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class HomeController {

	@GetMapping("/form")
	private String readForm(@ModelAttribute User user) {
		return "form";
	}
	
	@PostMapping("/confirm")
	public String confirm(@ModelAttribute User user) {
		return "confirm";
	}

}
