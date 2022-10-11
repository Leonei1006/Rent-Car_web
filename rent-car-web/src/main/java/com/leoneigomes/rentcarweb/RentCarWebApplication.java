package com.leoneigomes.rentcarweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RentCarWebApplication {

	public static void main(String[] args){SpringApplication.run(RentCarWebApplication.class, args);}

		@GetMapping("/")
		public String index(){
			return "Oi!";
		}
}
