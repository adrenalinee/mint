package org.mint.rest.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.util.LinkedMultiValueMap;
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
			@RequestParam MultiValueMap<String, String> queryParams, HttpServletRequest request) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(request.getInputStream()));
		
		int buffer;
		while ((buffer = bufferedReader.read()) != -1) {
			sb.append((char) buffer);
		}
		
		
		Response r = new Response();
		r.setHeaders(headers);
		r.setQueryParams(queryParams);
		r.setRequestBody(sb.toString());
		r.setRequestMethod(request.getMethod());
		r.setRequestUrl(request.getQueryString());
		
		return r;
	}
	
	@CrossOrigin
	@RequestMapping("/reflect")
	Response reflect(
			@RequestHeader MultiValueMap<String, String> headers,
			HttpServletRequest request) throws Exception {
		
		String body = toString(request.getInputStream());
		final String contentType = request.getContentType();
		if (body == null && contentType != null) {
			if (contentType.contains("multipart")) {
				body = multiPartFormToString(request.getParts(), contentType);
			}
			
			if (contentType.contains("application/x-www-form-urlencoded")) {
				
			}
		}
		
		final Response r = new Response();
		r.setRequestBody(body);
			
		
//		request.getParts().forEach(p -> {
//			System.out.println("-------------");
//			System.out.println(p.getName());
//			System.out.println(p.getContentType());
//			p.getHeaderNames().forEach(hn -> {
//				System.out.print(hn);
//				System.out.print(": ");
//				System.out.println(p.getHeader(hn));
//			});
//			System.out.println("-");
//			try {
//				System.out.println(toString(p.getInputStream()));
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		});
		
		
		r.setRequestMethod(request.getMethod());
		r.setHeaders(headers);
		
		
		final String queryString = request.getQueryString();
		String requestUrl = request.getRequestURL().toString();
		
		if (queryString != null) {
			requestUrl += "?";
			final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
			r.setQueryParams(queryParams);
			
			if (queryString != "") {
				requestUrl += queryString;
				
				Arrays.asList(queryString.split("&")).stream()
				.map(p -> {
					String[] nameValue = p.split("=");
					return new NameValue(nameValue[0], nameValue[1]);
				}).forEach(nv -> {
					queryParams.add(nv.getName(), nv.getValue());
				});
			}
		}
		
		r.setRequestUrl(requestUrl);
		
		
		
		return r;
	}
	
//	private 
	
	private String multiPartFormToString(Collection<Part> parts, String contentType) {
		final String boundary =
			Arrays.asList(contentType.split(";")).stream()
			.map(p -> p.trim())
			.filter(p -> p.startsWith("boundary="))
			.map(p -> p.split("=")[1])
			.findFirst()
			.get();
		
		final StringBuilder body = new StringBuilder();
		parts.stream().forEach(p -> {
			body.append(boundary);
			p.getHeaderNames().forEach(hn -> {
				body.append("\r\n");
				body.append(hn);
				body.append(": ");
				body.append("\r\n\r\n");
				body.append(p.getHeader(hn));
			});
			
			try {
				body.append(toString(p.getInputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		return body.toString();
	}
	
	private String toString(InputStream is) throws IOException {
		final StringBuilder sb = new StringBuilder();
		final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
		
		int buffer;
		while ((buffer = bufferedReader.read()) != -1) {
			sb.append((char) buffer);
		}
		
		if (sb.length() == 0) {
			return null;
		}
		
		return sb.toString();
	}
}

class NameValue {
	private String name;
	private String value;
	
	public NameValue(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}

class Response {
	private String requestMethod;
	private String requestUrl;
	
	private MultiValueMap<String, String> headers;
	private MultiValueMap<String, String> queryParams;
	private String requestBody;
	
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
	public String getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	public String getRequestUrl() {
		return requestUrl;
	}
	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}
}

