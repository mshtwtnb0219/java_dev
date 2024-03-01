package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TeacherController {


	private final TeacherService service;
	
	@GetMapping("/")
	public String getAllTeacher(Model model) {
		model.addAttribute("page",service.selectAll());
		
		return "list";
	}
	
	
	@GetMapping("/add")
	public String addTeacher(@ModelAttribute Teacher teacher) {
		return "form";
	}
	
	@PostMapping("/process")
	public String addTeacher(@Validated @ModelAttribute Teacher teacher ,BindingResult result) {
		if (result.hasErrors()) {
			return "form";
			
		}
		service.save(teacher);
		
		return "redirect:/";
	}
	
	
	@GetMapping("/edit/{id}")
	public String editTeacher(@PathVariable Long id ,Model model) {
		model.addAttribute("teacher",service.selectByPrimariKey(id));
		return "form";
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteTeacher(@PathVariable Long id) {
		service.delete(id);
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
