/**
 * 
 */
package com.hao.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hao.springboot.bean.User;

/**
 * @author weihao
 *
 */
public interface UserDao extends JpaRepository<User, Long>
{
	@Override
	List<User> findAll();

	List<User> findByEmail(String email);

	List<User> findByEmailAndId(String email, Integer id);
}
