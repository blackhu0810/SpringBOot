/**
 * 
 */
package com.hao.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hao.springboot.bean.User;
import com.hao.springboot.dao.UserDao;

/**
 * @author weihao
 *
 */
@Service
public class UserService
{
	@Autowired
	private UserDao userDao;

	public void insertUser()
	{
		User user = new User();
		user.setPassword("springboot");
		user.setEmail("springboot@gmail.com");
		user.setCellphone("0912345789");
		user.setAddress("台北市");
		userDao.save(user);
	}

	public List<User> queryUserByEmail(String email)
	{
		return userDao.findByEmail(email);
	}
}
