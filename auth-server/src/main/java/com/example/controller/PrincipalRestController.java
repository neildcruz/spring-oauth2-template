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
public class PrincipalRestController {

	@GetMapping("/user")
	public Principal principal(Principal principal) {
		return principal;
	}
}
