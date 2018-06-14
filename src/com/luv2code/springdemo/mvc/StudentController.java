package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@ModelAttribute("student") Student student) {
		System.out.println("Student firstName: " + student.getFirstName() +
				" lastName: " + student.getLastName());
		System.out.println("From country: " + student.getCountry());
		return "student-confirmation";
	}
}
