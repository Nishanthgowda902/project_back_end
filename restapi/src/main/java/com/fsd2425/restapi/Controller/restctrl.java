package com.fsd2425.restapi.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restctrl {

	@GetMapping("/")
	public ResponseEntity<String>Welcome() {
		return  ResponseEntity.ok("Welcome to Spring Security Demo...");
		}
	
	@GetMapping("/user")
	public ResponseEntity<String> UserResponse(){
		return ResponseEntity.ok("Welcome User...");		
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> AdminResponse(){
		return ResponseEntity.ok("Welcome Admin...");		
	}
	
	@GetMapping("/error/access-denied")
	public ResponseEntity<?> AccessDeniedResponse(){
		return ResponseEntity.ok("Invalid Credentials. Access Denied.");		
	}

}
