package org.mint.rest.controller;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReflectRestController {
	
	
	@CrossOrigin
	@RequestMapping("/test")
	Response test(
			@RequestHeader MultiValueMap<String, String> headers,
			@RequestParam MultiValueMap<String, String> queryParams) {
		
		Response r = new Response();
		r.setHeaders(headers);
		r.setQueryParams(queryParams);
		// r.setRequestBody(requestBody);
		
		return r;
	}
}

class Response {
	MultiValueMap<String, String> headers;
	MultiValueMap<String, String> queryParams;
	String requestBody;
	
	public MultiValueMap<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(MultiValueMap<String, String> headers) {
		this.headers = headers;
	}
	public MultiValueMap<String, String> getQueryParams() {
		return queryParams;
	}
	public void setQueryParams(MultiValueMap<String, String> queryParams) {
		this.queryParams = queryParams;
	}
	public String getRequestBody() {
		return requestBody;
	}
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}
}