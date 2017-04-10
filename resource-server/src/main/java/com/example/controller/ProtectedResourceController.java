/**
 * 
 */
package com.example.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NDcruz
 *
 */
@RestController
public class ProtectedResourceController {
	
	@GetMapping("/resource")
	public String simpleProtectedResource() {
		return "This is a protected resource";
	}
	
	@GetMapping("/admin/principal")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Principal principal(Principal p) {
		return p;
	}
	

}
