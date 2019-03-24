/**
 * 
 */
package com.hao.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author weihao
 *
 */
@Controller
public class SpringSecurityController
{

	@RequestMapping("/admin")
	public String name()
	{
		return "index";
	}

	@RequestMapping("/user")
	public String user(Authentication auth, Model model)
	{
		model.addAttribute("name", auth.getName());
		return "index";
	}
}
