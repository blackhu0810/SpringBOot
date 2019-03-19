/**
 * 
 */
package com.hao.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hao.demo.bean.Member;
import com.hao.demo.dao.MemberDao;

/**
 * @author weihao
 *
 */
@Service
public class MemberService
{
	@Autowired
	private MemberDao memberDao;

	/**
	 * 模擬事務出現問題資料不會被更新
	 */
	@Transactional
	public void changemoney()
	{
		memberDao.updateMember("Wayne", 22, 3000.0, 7);
		// 模拟转账过程中可能遇到的意外状况
		int temp = 1 / 0;
		memberDao.updateMember("Rachel", 19, 5000.0, 8);
	}

	public void deleteService(int id)
	{
		memberDao.deleteMember(id);
	}

	public void insertService()
	{
		memberDao.insertMember("Wayne", 22, 3000.0);
		memberDao.insertMember("Rachel", 19, 3000.0);
	}

	public List<Member> selectAllMember()
	{
		return memberDao.findAllMember();
	}

	public Member selectMemberByName(String name)
	{
		return memberDao.findMemberByName(name);
	}
}
