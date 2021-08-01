package net.mock.entity;




public class ToDanPhoEntity {


	private int id_ToDanPho;


	private String phuong;


	public int getId_ToDanPho() {
		return id_ToDanPho;
	}


	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}


	public void setId_ToDanPho(int id_ToDanPho) {
		this.id_ToDanPho = id_ToDanPho;
	}
	public String getPhuong() {
		return phuong;
	}


	public ToDanPhoEntity(int id_ToDanPho, String phuong) {
		super();
		this.id_ToDanPho = id_ToDanPho;
		this.phuong = phuong;
	}


	public ToDanPhoEntity() {
		super();
	}



	





}
