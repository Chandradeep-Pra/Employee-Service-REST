package com.nissan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	//http://localhost:9095/    --- endpoint
	
	@GetMapping("/")
	public String sayHello() {
		return "Hi user";
	}
	
	// http://localhost:9095/workout    ---endpoint
	@RequestMapping("/song")
	public String getDailyWorkout() {
		return "Song for the Day : Hosana";
	}
}
