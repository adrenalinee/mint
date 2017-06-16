package org.mint.rest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
