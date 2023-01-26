package io.reflectoring.com.rawendra.project.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(path = "/string", method = RequestMethod.GET)
	public String getSomeString() {
		return "this is a dummy string to test the api";
	}

}
