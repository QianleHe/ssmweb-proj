package com.project.ssm.web;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
@RequestMapping("/")
@Scope("prototype")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@Autowired
	MemberDao memberDao;
	
	private static Logger log = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping("")
	public String login(HttpSession httpSession) {
		if (httpSession != null) {
			Member member = (Member)httpSession.getAttribute("newmember");
			System.out.println(member);
			if (member != null) {
				boolean loginType = memberService.login(member.getMemberEmail(), member.getPassword());
				if (loginType) {
					return "redirect:member/" + member.getMemberId();
				}
			}
		}
		return "login";
	}
	
//	@RequestMapping(value = "/login")
//	public String login(Member member, HttpServletRequest request) {
//		boolean loginType = memberService.login(member.getMemberEmail(), member.getPassword());
//		log.debug("-------The login type----");
//		log.debug(Boolean.toString(loginType));
//		//log.debug(member);
//		if (loginType) {
//			Member newmember = memberDao.queryByEmail(member.getMemberEmail());
//			request.setAttribute("newmember", newmember);
//			return "redirect:ID/" + newmember.getMemberId();
//		} else {
//			request.setAttribute("message", "Wrong usersname and password");
//			return "error";
//		}
//	}
	
	@RequestMapping(value = "/login")
	public String login(Member member, HttpSession httpSession) {
		boolean loginType = memberService.login(member.getMemberEmail(), member.getPassword());
		log.debug("-------The login type----");
		log.debug(Boolean.toString(loginType));
		//log.debug(member);
		if (loginType) {
			Member newmember = memberDao.queryByEmail(member.getMemberEmail());
			httpSession.setAttribute("newmember", newmember);
			return "redirect:member/" + newmember.getMemberId();
		} else {
			httpSession.setAttribute("message", "Wrong usersname and password");
			return "error";
		}
	}
	
	/**
	 * Log out part (remove session)
	 * @param httpSession
	 * @return
	 */
	@RequestMapping(value = "/logout") 
	public String logout(HttpSession httpSession) {
		httpSession.removeAttribute("newmember");
		return "login";
	}
	
	/**
	 * Redirect the member information to RESTful url 
	 * @param memberId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/member/{memberId}")
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
	
	/**
	 * regist part
	 * @param member
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/register/i", method = RequestMethod.POST)
	public String register(Member member, HttpServletRequest request) {
		System.out.println("-----------start--------------");
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
	
	/**
	 * mapping the url jump to member infomation
	 * @return
	 */
	@RequestMapping(value = "/memberinfo")
	public String memberinfo() {
		return "memberinfo";
	}
}
