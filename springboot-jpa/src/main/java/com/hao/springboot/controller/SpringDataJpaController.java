/**
 * 
 */
package com.hao.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hao.springboot.bean.User;
import com.hao.springboot.service.UserService;

/**
 * @author weihao
 *
 */
@RestController
public class SpringDataJpaController
{
	@Autowired
	private UserService userService;

	@RequestMapping("/insertData")
	public String insertData()
	{
		userService.insertUser();
		return "InsertUser Success";
	}

	@RequestMapping("/queryUserByEmail")
	public List<User> queryUserByEmail(@RequestParam String email)
	{
		return userService.queryUserByEmail(email);
	}
}
