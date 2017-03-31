package com.project.ssm.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.ssm.dao.MemberDao;
import com.project.ssm.entity.Member;
import com.project.ssm.service.MemberService;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;
	
	public boolean login(String memberemail, @Param("password") String password) {
		
//		Member member = memberDao.queryByName(membername);
//		
//		if (member != null) {
//			if (member.getPassword().equals(password)) {
//				return true;
//			}
//		}
		
		Member member = memberDao.queryByEmail(memberemail);
		
		if (member != null) {
			if (member.getMemberEmail().equals(memberemail) && member.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
