package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	// Controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// Controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// Controller method to read form data and add it to our model
	@RequestMapping("/processFormVersionTwo")
	public String allCaps(HttpServletRequest request, Model model) {
		// Read request parameter from the HTML form
		String name = request.getParameter("studentName");
		// Convert the data
		name = name.toUpperCase();
		// Add the data to the model
		model.addAttribute("message", name);
		
		return "helloworld";
	}
}
