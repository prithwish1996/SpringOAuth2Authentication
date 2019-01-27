package com.demooAuth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	 @GetMapping(value = "/")
	    public String index(){
	        return "Hello world";
	    }

	    @GetMapping(value = "/restrictedPage")
	    public String privateArea(){
	        return "Welcome!! Correct Token";
	    }

	}
