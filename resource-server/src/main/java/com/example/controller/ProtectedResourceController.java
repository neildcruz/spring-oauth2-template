/**
 * 
 */
package com.example.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NDcruz
 *
 */
@RestController
public class ProtectedResourceController {
	
	@GetMapping("/resource")
	public String protectedResource() {
		return "This is a protected resource";
	}
	
	@GetMapping("/principal")
	public Principal principal(Principal p) {
		return p;
	}
	

}
