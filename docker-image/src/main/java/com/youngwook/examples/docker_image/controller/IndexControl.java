package com.youngwook.examples.docker_image.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youngwook.examples.docker_image.domain.HelloMessage;


@RestController
public class IndexControl {
	final static Logger log = LoggerFactory.getLogger(IndexControl.class);
	
	@RequestMapping("/")
	public HelloMessage index() {
		return new HelloMessage("visitor","hello!");
	}
	
	@RequestMapping("/ping")
	public String ping() {
		return "pong";
	}
}
