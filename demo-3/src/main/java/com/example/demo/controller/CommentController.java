package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Comment;
import com.example.demo.repository.CommentRepository;

@Controller
public class CommentController {
	
	
	private final CommentRepository repository;
	
	// @autowired ←コンストラクタがひとつの場合は省略できる
	public CommentController (CommentRepository repository ){
		this.repository = repository;
	}

	
	@GetMapping
	public String getAllComment(@ModelAttribute Comment comment ,Model model) {
		model.addAttribute("commnets" ,repository.findAll());
		
		return "list";
	}
	
	@PostMapping("/add")
	public String addCommnent (@Validated @ModelAttribute Comment comment ,BindingResult result,Model model) {
		
		
		model.addAttribute("comments" ,repository.findAll());
		if (result.hasErrors()) {
			return "list";
		}
		repository.save(comment);
		
		return "redirect:/";
	}
	
	
	
	


}
