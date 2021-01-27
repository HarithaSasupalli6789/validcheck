package com.week3.validations;

import javax.validation.Valid;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	//@RequestMapping(value ="/test/postmethod/sayhello", method=RequestMethod.POST,consumes ="application/json")
	@PostMapping("/data")
	//@PostMapping(path = "/data",produces = "application/json")
	public Customer getData(@Valid @RequestBody Customer t)
	{
		//return "No"+t.getNo()+" "+"Name"+t.getName();
		System.out.println("hello , it worked !!");
		return t;
	}
}