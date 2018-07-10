package com.io.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// Maps with all http methods by default
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hello World";
	}
	
	

}
