package com.project.ssm.service;

public interface MemberService {
	
	/**
	 * @param membername
	 * @param password
	 * @return
	 */
	public boolean login(String membername, String password);
	
}
