package com.project.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.project.ssm.entity.Member;
import com.project.ssm.service.MemberService;

public class LogInterceptor implements HandlerInterceptor{
	
	@Autowired
	MemberService memberService;

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("This interceptor is available");
//		HttpSession session=arg0.getSession(true); 
//		Member member = (Member)session.getAttribute("newmember");
//		boolean loginType = memberService.login(member.getMemberEmail(), member.getPassword());
//		if (member != null && loginType) {
//			System.out.println("it is true");
//			arg1.sendRedirect("redirect:ID/" + member.getMemberId());
//		}
//		System.out.println("it is false");
		return true;
	}
	
}
