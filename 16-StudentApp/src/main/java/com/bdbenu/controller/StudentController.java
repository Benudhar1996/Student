package com.bdbenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	@GetMapping("/loadPage")
	public String loadPage(Model model) {
		
		return"index";
	}

}
