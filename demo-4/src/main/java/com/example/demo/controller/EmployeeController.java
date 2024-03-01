package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

	public final EmployeeRepository employeeRepository;


	@GetMapping("/")
	private String showList(Model model) {
		model.addAttribute("employees",employeeRepository.findAll());

		return "index";

	}


	@GetMapping("/add")
	public String addEmployee(@ModelAttribute Employee employee) {
		return "form";
	}

	@PostMapping("/process")
	public String process(@Validated @ModelAttribute Employee employee,BindingResult result) {
		if (result.hasErrors()) {
			return "form";
		}

		employeeRepository.save(employee);
		return "redirect:";
	}

	@GetMapping("/edit/{id}")
	public String editEmployee(@PathVariable Long id ,Model model) {
		model.addAttribute("employee",employeeRepository.findById(id));

		return "form";
	}

	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Long id ,Model model) {
		employeeRepository.deleteById(id);

		return "redirect:";
	}

}
