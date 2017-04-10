/**
 * 
 */
package com.example.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author NDcruz
 *
 */
@RestController
@SessionAttributes("authorizationRequest")
public class PrincipalRestController {

	@GetMapping("/user")
	public Principal principal(Principal principal) {
		return principal;
	}
}
