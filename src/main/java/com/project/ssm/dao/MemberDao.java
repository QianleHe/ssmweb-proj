package com.project.ssm.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.project.ssm.entity.Member;

public interface MemberDao {
	
	/**
	 * @param memberId
	 * @return
	 * Search for member info by member id  
	 */
	Member queryById(long memberId);
	
	/**
	 * @param memberEmail
	 * @return
	 * Search for member info by member email address
	 */
	Member queryByEmail(String memberEmail); 
	
	/**
	 * @param memberName
	 * @return
	 */
	Member queryByName(String memberName);
	
	/**
	 * @param membername
	 * @param memberEmail
	 * @param gender
	 * @param age
	 * @return success or fail
	 * addmember into database
	 * 
	 */
	int addMember(@Param("memberName") String memberName, @Param("memberEmail") String memberEmail, @Param("gender") int gender, @Param("age") int age, @Param("password") String password);
	
	List<Member> listAll();
}
