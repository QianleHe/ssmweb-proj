package com.project.ssm.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.ssm.service.MemberService;



public class MemberServiceTest {
	@Autowired
	MemberService memberService;
	
	@Test
	public void testMemberService() {
		String membername = "Jack";
		String password = "12345";
		boolean is = memberService.login(membername, password);
		System.out.println(is);
	}
}
