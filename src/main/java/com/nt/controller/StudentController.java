package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@GetMapping("/")
	public String showHomePage() {

		return "welcome";
	}

	@GetMapping("/register")
	public String registerStuden(@RequestParam("sno") String sno, @RequestParam("sname") String sname) {

		return "register";
	}

	@GetMapping("/welcome")
	public String registerStuden() {

		return "welcome";
	}
}
