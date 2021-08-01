package net.mock.entity;

import java.util.Date;




public class SoHoKhauEntity {
	


	private String id_SHK;
	
	private String id_ChuHo;
	

	private String diaChi;
	

	private ToDanPhoEntity id_ToDanPho;

	
	
	private Date ngayCapSo;







	public String getId_ChuHo() {
		return id_ChuHo;
	}



	public void setId_ChuHo(String id_ChuHo) {
		this.id_ChuHo = id_ChuHo;
	}



	public String getDiaChi() {
		return diaChi;
	}



	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}



	public String getId_SHK() {
		return id_SHK;
	}



	public void setId_SHK(String id_SHK) {
		this.id_SHK = id_SHK;
	}





	public ToDanPhoEntity getId_ToDanPho() {
		return id_ToDanPho;
	}



	public void setId_ToDanPho(ToDanPhoEntity id_ToDanPho) {
		this.id_ToDanPho = id_ToDanPho;
	}



	public Date getNgayCapSo() {
		return ngayCapSo;
	}



	public void setNgayCapSo(Date ngayCapSo) {
		this.ngayCapSo = ngayCapSo;
	}



	public SoHoKhauEntity() {
		super();
	}









	public SoHoKhauEntity(String id_SHK, String id_ChuHo, String diaChi, ToDanPhoEntity id_ToDanPho, Date ngayCapSo) {
		super();
		this.id_SHK = id_SHK;
		this.id_ChuHo = id_ChuHo;
		this.diaChi = diaChi;
		this.id_ToDanPho = id_ToDanPho;
		this.ngayCapSo = ngayCapSo;
	}




	
}
