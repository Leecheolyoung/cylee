package net.slipp.web;

public class User {
	private String userId;
	private String exampleInputPassword1;
	private String usrName;
	private String usrEmail;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setExampleInputPassword1(String exampleInputPassword1) {
		this.exampleInputPassword1 = exampleInputPassword1;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}

	public void setUsrEmail(String usrEmail) {
		this.usrEmail = usrEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", exampleInputPassword1=" + exampleInputPassword1 + ", usrName=" + usrName
				+ ", usrEmail=" + usrEmail + "]";
	}
	
}
