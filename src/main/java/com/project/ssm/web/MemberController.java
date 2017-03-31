package com.project.ssm.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.ssm.dao.MemberDao;
import com.project.ssm.entity.Member;
import com.project.ssm.service.MemberService;


@Controller
@RequestMapping("/member")
@Scope("prototype")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@Autowired
	MemberDao memberDao;
	
	private static Logger log = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping("")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/login")
	public String login(Member member, HttpServletRequest request) {
		

		boolean loginType = memberService.login(member.getMemberEmail(), member.getPassword());
		log.debug("-------The login type----");
		log.debug(Boolean.toString(loginType));
		//log.debug(member);
		if (loginType) {
			Member newmember = memberDao.queryByEmail(member.getMemberEmail());
			request.setAttribute("newmember", newmember);
			return "success";
		} else {
			request.setAttribute("message", "Wrong usersname and password");
			return "error";
		}
	}
}
