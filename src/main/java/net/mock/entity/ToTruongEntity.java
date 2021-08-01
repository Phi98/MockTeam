 package net.mock.entity;

public class ToTruongEntity {
	private String username;
	private NhanKhauEntity id_NK;
	private String pw;
	private ToDanPhoEntity id_ToDanPho;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public NhanKhauEntity getId_NK() {
		return id_NK;
	}
	public void setId_NK(NhanKhauEntity id_NK) {
		this.id_NK = id_NK;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public ToDanPhoEntity getId_ToDanPho() {
		return id_ToDanPho;
	}
	public void setId_ToDanPho(ToDanPhoEntity id_ToDanPho) {
		this.id_ToDanPho = id_ToDanPho;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ToTruongEntity(String username, NhanKhauEntity id_NK, String pw, ToDanPhoEntity id_ToDanPho, String email) {
		super();
		this.username = username;
		this.id_NK = id_NK;
		this.pw = pw;
		this.id_ToDanPho = id_ToDanPho;
		this.email = email;
	}
	public ToTruongEntity() {
		super();
	}





}
