package io.reflectoring.com.rawendra.project.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.reflectoring.com.rawendra.project.springboot.configuration.ConfigProps;

@RestController
public class DemoController {
	
	@Autowired
	private ConfigProps configProps;
	
	
	@RequestMapping(path = "/string", method = RequestMethod.GET)
	public String getSomeString() {
		return "this is a dummy string to test the api";
	}
	
	@RequestMapping(path = "/props", method = RequestMethod.GET)
	public String getProps() {
		
		String propsString=configProps.getKey()+"-"+configProps.getUsername()+"-"+configProps.getUrl();
		 
		return propsString;
	}

}
