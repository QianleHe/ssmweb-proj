package com.project.ssm.entity;

public class Restaurant {
	
	private long resId;
	
	private String resName;
	
	private String resDesc;
	
	private String resAddr;
	
	private double resRate;
	
	private int resRateNum;
	
	private int attendVoteNum;


	public long getResId() {
		return resId;
	}

	public void setResId(long resId) {
		this.resId = resId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getResDesc() {
		return resDesc;
	}

	public void setResDesc(String resDesc) {
		this.resDesc = resDesc;
	}

	public String getResAddr() {
		return resAddr;
	}

	public void setResAddr(String resAddr) {
		this.resAddr = resAddr;
	}

	public double getResRate() {
		return resRate;
	}

	public void setResRate(double resRate) {
		this.resRate = resRate;
	}

	public int getResRateNum() {
		return resRateNum;
	}

	public void setResRateNum(int resRateNum) {
		this.resRateNum = resRateNum;
	}
	
	public int getAttendVoteNum() {
		return attendVoteNum;
	}
	
	public void setAttendVoteNum(int attendVoteNum) {
		this.attendVoteNum = attendVoteNum;
	}
	
}
