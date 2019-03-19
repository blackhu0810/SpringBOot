/**
 * 
 */
package com.hao.springboot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author weihao
 *
 */
@Entity
@Table(name = "USER")
public class User
{
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "CELLPHONE")
	private String cellphone;
	@Column(name = "EMAIL")
	private String email;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "PASSWORD")
	private String password;

	public String getAddress()
	{
		return address;
	}

	public String getCellphone()
	{
		return cellphone;
	}

	public String getEmail()
	{
		return email;
	}

	public int getId()
	{
		return id;
	}

	public String getPassword()
	{
		return password;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public void setCellphone(String cellphone)
	{
		this.cellphone = cellphone;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

}
