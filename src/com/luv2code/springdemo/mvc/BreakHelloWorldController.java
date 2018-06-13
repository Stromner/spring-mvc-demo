package com.luv2code.springdemo.mvc;

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
