package com.luisgomezcaballero.cloudchildservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private Environment environment;

	@RequestMapping(value = "/myuri", method = RequestMethod.GET)
	public MyBean mymethod() {

		MyBean myBean = new MyBean();
		
		myBean.setMyString("Hello from Child Service!");
		myBean.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

		return myBean;
	}
}
