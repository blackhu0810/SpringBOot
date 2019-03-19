/**
 * 
 */
package com.hao.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hao.demo.bean.Member;

/**
 * @author weihao
 *
 */
@Mapper
public interface MemberDao
{
	@Delete("DELETE from Member WHERE id = #{id}")
	void deleteMember(@Param("id") int id);

	/**
	 * 查詢所有用戶
	 */
	@Select("SELECT * FROM Member")
	List<Member> findAllMember();

	/**
	 * 用名子查詢
	 */
	@Select("SELECT * FROM Member WHERE name = #{name}")
	Member findMemberByName(@Param("name") String name);

	/**
	 * Insert資料
	 */
	@Insert("INSERT INTO Member(name, age,money) VALUES(#{name}, #{age},#{money})")
	void insertMember(@Param("name") String name, @Param("age") Integer age, @Param("money") Double money);

	/**
	 * Id 更新資料
	 */
	@Update("UPDATE Member SET name = #{name},age = #{age},money= #{money} WHEREid=#{id}")
	void updateMember(@Param("name") String name, @Param("age") Integer age, @Param("money") Double money, @Param("id") int id);
}
