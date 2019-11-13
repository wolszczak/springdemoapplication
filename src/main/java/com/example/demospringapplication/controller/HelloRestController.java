package com.example.demospringapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloRestController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello from Spring!";
	}

}
