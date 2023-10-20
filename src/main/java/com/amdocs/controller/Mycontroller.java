package com.amdocs.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class Mycontroller {
	
	 @GetMapping
	    public String getAllEmployees() {
		 	System.out.println("Console:Hello World");
	         return "Hello World";
	    }
}
