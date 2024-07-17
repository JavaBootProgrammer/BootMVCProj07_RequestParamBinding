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

	// http://localhost:8080/BootMVCProj07_RequestParamBinding/register?sno=1&sname=Anand

	@GetMapping("/register")
	public String registerStudent(@RequestParam("sno") String sno, @RequestParam("sname") String sname) {
		System.out.print(sno + "           " + sname);
		return "register";
	}

	// //http://localhost:8080/BootMVCProj07_RequestParamBinding/registerDefault?sno=1&sname=Anand
	// request param name is same as parames so
	@GetMapping("/registerDefault")
	public String registerStudentDefault(@RequestParam String sno, @RequestParam String sname) {

		System.out.print(sno + "           " + sname);
		return "register";
	}

	@GetMapping("/welcome")
	public String registerStuden() {

		return "welcome";
	}
}
