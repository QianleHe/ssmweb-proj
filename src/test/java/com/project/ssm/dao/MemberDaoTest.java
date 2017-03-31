package com.project.ssm.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.peoject.ssm.BaseTest;
import com.project.ssm.entity.Member;

public class MemberDaoTest extends BaseTest{
	@Autowired
	MemberDao memberDao;
	
	@Test
	public void testMemberQueryById(){
		long memberId = 1001;
		Member member = memberDao.queryById(memberId);
		System.out.println(member);
	}
	
	@Test
	public void testMemberQueryByName() {
		String memberName = "Jack";
		Member member = memberDao.queryByName(memberName);
		System.out.println(member);
	}
}
