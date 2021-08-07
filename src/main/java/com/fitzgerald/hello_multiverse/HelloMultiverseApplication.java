package com.fitzgerald.hello_multiverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController//features of requests response cycle
public class HelloMultiverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloMultiverseApplication.class, args);
	}
	
	@RequestMapping("/")
	//method that maps to the request route above
	public String sayMessageOne() {
		return "Hello Multiverse!";
	}	
	
	@RequestMapping("/random")
	public String sayMessageTwo() {
		return "Will we unfold all that is, righting the Earth's Spin?";
	}
	
	

}
