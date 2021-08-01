package net.mock.ma;

public class TTModelAttribute {
	
	private String userName;
	private String pass;
	private String rePass;
	private String rePass1;
	
	
public TTModelAttribute() {
		super();
	}


public TTModelAttribute(String userName, String pass, String rePass, String rePass1) {
	super();
	this.userName = userName;
	this.pass = pass;
	this.rePass = rePass;
	this.rePass1 = rePass1;
}


public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public String getPass() {
	return pass;
}


public void setPass(String pass) {
	this.pass = pass;
}


public String getRePass() {
	return rePass;
}


public void setRePass(String rePass) {
	this.rePass = rePass;
}


public String getRePass1() {
	return rePass1;
}


public void setRePass1(String rePass1) {
	this.rePass1 = rePass1;
}	


	
	

}
