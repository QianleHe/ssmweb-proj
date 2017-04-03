package com.project.ssm.web;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
			return "redirect:view/" + newmember.getMemberId();
		} else {
			request.setAttribute("message", "Wrong usersname and password");
			return "error";
		}
	}
	
	@RequestMapping(value = "/view/{memberId}")
	public String doSuccess(@PathVariable("memberId") Long memberId,
			Map<String, Object> model) {
			Member member = memberDao.queryById(memberId);
			model.put("newmember",member);
			return "success";
	}
	
	@RequestMapping(value = "/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping(value = "/register/i", method = RequestMethod.POST)
	public String register(Member member, HttpServletRequest request) {
		//long id = new Date().getTime();
		System.out.println("-----------start--------------");
		//Member membertemp = new Member(member.getMemberName(), member.getMemberEmail(), member.getGender(), member.getAge(), member.getPassword());
		//System.out.println(membertemp);
		//System.out.println("...." + member);
		//member.setMemberId(id);
		//int registType = memberDao.addMember(membertemp.getMemberName(), membertemp.getMemberEmail(), membertemp.getGender(), membertemp.getAge(), membertemp.getPassword());
		int registType = memberDao.addMember(member.getMemberName(), member.getMemberEmail(), member.getGender(), member.getAge(), member.getPassword());
		if (registType == 1) {
			request.setAttribute("member", member);
			return "registsuccess";
		} else {
			request.setAttribute("message", "Register error");
			return "registerror";
		}
	}
	
	/**
	 * Show all member in the database
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/showall")
	public String showAll(HttpServletRequest request) {
		List<Member> memberList = memberDao.listAll();
		if (!memberList.isEmpty()) {
			request.setAttribute("memberlist", memberList);
			return "listmember";
		}
		return "error";
	}
}
