package com.getyourpixel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping
	public String getHomepage(Model model) {
		return "home";
	}

}
