/**
 * 
 */
package com.hao.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weihao
 *
 */
@RestController
public class HelloController
{
	@RequestMapping(value = "/helloWorld", method = RequestMethod.POST)
	public String welcomSpringBootRESTFul(@RequestParam(value = "name", required = false) String name)
	{
		return "Welcom Spring Boot RESTFul API " + name;
	}
}
