/**
 * 
 */
package com.example.controller;

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
	

}
