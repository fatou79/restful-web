package com.fatou.rest.webservices.restfulwebservices.entity;

public class HelloWorldBean {
	
	private String message;
	
	
	public HelloWorldBean() {
	}

	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}

	
	
	
	
	
	
	
	
	
	

}
