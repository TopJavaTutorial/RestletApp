package com.topjavatutorial;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldResource extends ServerResource {
	@Get
	public String getMsg() {
		return "Hello World";
	}
}
