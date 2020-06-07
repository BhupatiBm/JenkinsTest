package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/welcome.htm")
	public String getWelcomePage() {
		System.out.println("Welcome");
		return "welcome";
	}

}
