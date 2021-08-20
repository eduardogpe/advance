package com.eduardo.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping("/upload")
	public String upload() {
		return "upload.jsp";
	}
	
	
	@GetMapping("/question1")
	public String first() {
		return "question1.jsp";
	}
	
	@GetMapping("/question2")
	public String second() {
		return "question2.jsp";
	}
	
	
	@GetMapping("/question3")
	public String third() {
		return "question3.jsp";
	}
	
	@GetMapping("/question4")
	public String fourth() {
		return "question4.jsp";
	}
	
	@GetMapping("/question5")
	public String fifth() {
		return "question5.jsp";
	}
	
	@GetMapping("/question6")
	public String sixth() {
		return "question6.jsp";
	}
	
	@GetMapping("/question7")
	public String seventh() {
		return "question7.jsp";
	}
	
	@GetMapping("/question8")
	public String eigth() {
		return "question8.jsp";
	}
	
	@GetMapping("/question9")
	public String ninth() {
		return "question9.jsp";
	}
	
	@GetMapping("/question10")
	public String tenth() {
		return "question10.jsp";
	}
	
	@GetMapping("/end")
	public String end() {
		return "end.jsp";
	}
	
}
