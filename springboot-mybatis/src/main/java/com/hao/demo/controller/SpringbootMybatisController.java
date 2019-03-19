/**
 * 
 */
package com.hao.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hao.demo.bean.Member;
import com.hao.demo.service.MemberService;

/**
 * @author weihao
 *
 */
@RestController
public class SpringbootMybatisController
{
	@Autowired
	private MemberService memberService;

	@RequestMapping("/changemoney")
	public List<Member> testchangemoney()
	{
		memberService.changemoney();
		return memberService.selectAllMember();
	}

	@RequestMapping("/delete")
	public String testDelete()
	{
		memberService.deleteService(3);
		return "OK";
	}

	@RequestMapping("/insert")
	public List<Member> testInsert()
	{
		memberService.insertService();
		return memberService.selectAllMember();
	}

	@RequestMapping("/query")
	public List<Member> testQuery()
	{
		return memberService.selectAllMember();
	}
}
