package net.mock.entity;

import java.util.Date;

public class ChinhSuaEntity {
private String id_CS,loaiGiay,noiDung;
private NhanKhauEntity id_NK;
private SoHoKhauEntity id_SHK;
private ToDanPhoEntity id_ToDanPho;
private ToTruongEntity username;
private Date ngaySua;
public String getId_CS() {
	return id_CS;
}
public void setId_CS(String id_CS) {
	this.id_CS = id_CS;
}
public String getLoaiGiay() {
	return loaiGiay;
}
public void setLoaiGiay(String loaiGiay) {
	this.loaiGiay = loaiGiay;
}
public String getNoiDung() {
	return noiDung;
}
public ChinhSuaEntity() {
	super();
}
public void setNoiDung(String noiDung) {
	this.noiDung = noiDung;
}
public NhanKhauEntity getId_NK() {
	return id_NK;
}
public void setId_NK(NhanKhauEntity id_NK) {
	this.id_NK = id_NK;
}
public SoHoKhauEntity getId_SHK() {
	return id_SHK;
}
public void setId_SHK(SoHoKhauEntity id_SHK) {
	this.id_SHK = id_SHK;
}
public ToDanPhoEntity getId_ToDanPho() {
	return id_ToDanPho;
}
public void setId_ToDanPho(ToDanPhoEntity id_ToDanPho) {
	this.id_ToDanPho = id_ToDanPho;
}
public ToTruongEntity getUsername() {
	return username;
}
public void setUsername(ToTruongEntity username) {
	this.username = username;
}
public Date getNgaySua() {
	return ngaySua;
}
public void setNgaySua(Date ngaySua) {
	this.ngaySua = ngaySua;
}
public ChinhSuaEntity(String id_CS, String loaiGiay, String noiDung, NhanKhauEntity id_NK, SoHoKhauEntity id_SHK,
		ToDanPhoEntity id_ToDanPho, ToTruongEntity username, Date ngaySua) {
	super();
	this.id_CS = id_CS;
	this.loaiGiay = loaiGiay;
	this.noiDung = noiDung;
	this.id_NK = id_NK;
	this.id_SHK = id_SHK;
	this.id_ToDanPho = id_ToDanPho;
	this.username = username;
	this.ngaySua = ngaySua;
}

}
