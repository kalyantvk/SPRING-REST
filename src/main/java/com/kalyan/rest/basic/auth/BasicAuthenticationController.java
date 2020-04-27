package com.kalyan.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
@CrossOrigin(origins="http://localhost:4200")
//
public class BasicAuthenticationController {
	
	
	
	//eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJrYWx5YW4iLCJleHAiOjE1ODg1OTk0MzAsImlhdCI6MTU4Nzk5NDYzMH0.GI767ZhQYrbt9oEcYQ0vxFDU3xLmxi_T57DlRou5GfNOBHzQaC53aN0qStLPsCl0V3barmS2aTWMTdrcaWidmw
	
	//hello-world-bean
	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("You are authenticated");
	}
	
}
