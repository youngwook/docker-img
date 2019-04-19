package com.youngwook.examples.docker_image.domain;

public class HelloMessage {

	public String name;
	public String message;
	public HelloMessage(String name, String message) {
		this.name = name;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
