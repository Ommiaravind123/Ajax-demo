package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRestController {
	
	
	@GetMapping("/")
	public String load() {
		return "index";
	}

	@GetMapping("/msg")
	@ResponseBody
	public String getMsg(@RequestParam("name") String name) {
		String msg = "Hello, " + name;
		return msg;
	}

}
