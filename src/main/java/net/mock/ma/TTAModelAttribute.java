package net.mock.ma;

import net.mock.entity.NhanKhauEntity;
import net.mock.entity.ToDanPhoEntity;

public class TTAModelAttribute {
	
	private String username;
	private String id_NK;
	private String pw;
	private String id_ToDanPho;
	private String email;
	public TTAModelAttribute() {
		super();
	}
	public TTAModelAttribute(String username, String id_NK, String pw, String id_ToDanPho,
			String email) {
		super();
		this.username = username;
		this.id_NK = id_NK;
		this.pw = pw;
		this.id_ToDanPho = id_ToDanPho;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getId_NK() {
		return id_NK;
	}
	public void setId_NK(String id_NK) {
		this.id_NK = id_NK;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getId_ToDanPho() {
		return id_ToDanPho;
	}
	public void setId_ToDanPho(String id_ToDanPho) {
		this.id_ToDanPho = id_ToDanPho;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
