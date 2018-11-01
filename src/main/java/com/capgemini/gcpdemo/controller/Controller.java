package com.capgemini.gcpdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	 @CrossOrigin
	 @RequestMapping("/")
	  public String home() {
	    return "Hello World!";
	  }
	 
	  @CrossOrigin
	  @RequestMapping("/_ah/health")
	  public String healthy() {
	    // Message body required though ignored
	    return "Still surviving.";
	  }
}
