/**
 * 
 */
package com.hao.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author weihao
 *
 */
@Controller
public class ThymeleafController
{

	@RequestMapping("/thymeleaf")
	public String getThymeleaf(@RequestParam(value = "title", required = false, defaultValue = "第一個thymeleaf") String title, Model model)
	{
		model.addAttribute("name", title);
		return "index";
	}
}
