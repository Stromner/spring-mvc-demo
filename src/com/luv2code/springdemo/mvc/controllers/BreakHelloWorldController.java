package com.luv2code.springdemo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/brokenController")
public class BreakHelloWorldController {
	@RequestMapping("/showForm")
	public String showForm(){
		return "null";
	}
}
