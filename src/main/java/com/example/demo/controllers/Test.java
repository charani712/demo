package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping("/")
	public String index() {
		return "Hello visitor!";
	}
	
	@GetMapping("/task")
	public String task() {
		return "Task demonstration";
	}
	
	@GetMapping("/task/showMyInfo")
	public List<String> taskShowInfo() {
		return List.of("Charani,HYD,TS","--");
	}

	@GetMapping("/task/showMyHobbies")
	public List<String> taskShowHobbies() {
		return List.of("----");
	}
}
