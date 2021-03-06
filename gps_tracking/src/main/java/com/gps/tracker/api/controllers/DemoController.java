package com.gps.tracker.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/demo")
public class DemoController {

	
	@RequestMapping(value = "/getControllerName", method = RequestMethod.POST, produces = "application/json" )
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public String getControllerName() {
		return "DemoController";
	}
	
}
