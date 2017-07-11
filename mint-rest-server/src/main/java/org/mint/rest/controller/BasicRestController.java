package org.mint.rest.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author malibu
 *
 */
@RestController
public class BasicRestController {
	
	@CrossOrigin
	@RequestMapping("/slow")
	String slow() throws InterruptedException {
		Thread.sleep(5000);
		
		return "slow response";
	}
	
	@RequestMapping(path="/notAllowedAccess")
	ResponseEntity<String> cors() {
		return ResponseEntity.ok().body("cors");
	}
	
	@CrossOrigin
	@RequestMapping(path="/notAllowedAccess", method= RequestMethod.OPTIONS)
	ResponseEntity<String> optionsCors() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccessControlAllowOrigin("*");
		return ResponseEntity.ok().headers(headers).build();
	}
	
	@CrossOrigin
	@RequestMapping("/400")
	ResponseEntity<String> badRequest() {
		return ResponseEntity.badRequest().body("bad request");
	}
	
	@CrossOrigin
	@RequestMapping("/404")
	ResponseEntity<String> notFound() {
		return ResponseEntity.notFound().build();
	}
	
	@CrossOrigin
	@RequestMapping("/500")
	ResponseEntity<String> internalServerError() {
		throw new RuntimeException("internal server error");
	}
}
