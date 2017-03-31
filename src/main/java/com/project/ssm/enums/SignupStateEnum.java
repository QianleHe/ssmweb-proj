package com.project.ssm.enums;

public enum SignupStateEnum {
	SUCCESS(1, "Signup Success"), REPEAT_EMAIL(0, "Repeat Email"), INNER_ERROR(-2, "System Error");
	
	private int state;
	
	private String stateinfo;
	
	private SignupStateEnum(int state, String stateinfo) {
		this.state = state;
		this.stateinfo = stateinfo;
	}

	public int getState() {
		return state;
	}

	public String getStateinfo() {
		return stateinfo;
	}
	
	public static SignupStateEnum indexOf(int index) {
		for (SignupStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
