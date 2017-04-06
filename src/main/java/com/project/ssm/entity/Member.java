package com.project.ssm.entity;

import java.util.Date;

public class Member {
	/**
	 * The id of the member
	 */
	private long memberId;

	/**
	 * The name of the member
	 */
	private String memberName;

	/**
	 * The email address of the member
	 */
	private String memberEmail;

	/**
	 * The gender of the member(0 for male, 1 for female)
	 */
	private int gender;

	/**
	 * The age of the member
	 */
	private int age;
	
	/**
	 * The password
	 */
	private String password;
	
	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Member() {
	}
	
	public Member(String memberName, String memberEmail, int gender, int age, String password) {
		//this.memberId = new Date().getTime();
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.gender = gender;
		this.age = age;
		this.password = password;
	}
	
	@Override
	public String toString() {
		if (gender == 0)
			return "The member info: [ name: " + memberName + " Id: " + memberId
					+ " email: " + memberEmail + " gender: " + "male" + " Age: " + age + " Password: " + password;
		return "The member info: [ name: " + memberName + " Id: " + memberId
				+ " email: " + memberEmail + " gender: " + "female" + " Age: " + age + " Password: " + password;
 	}
}
