package net.mock.entity;

import java.util.Date;

public class TinTucEntity {
private String id_TT,tieuDe,noiDungNgan,noiDung;
private Date ngayDang;
private ToTruongEntity  username;
public String getId_TT() {
	return id_TT;
}
public void setId_TT(String id_TT) {
	this.id_TT = id_TT;
}
public ToTruongEntity getUsername() {
	return username;
}
public void setUsername(ToTruongEntity username) {
	this.username = username;
}
public TinTucEntity() {
	super();
}
public String getTieuDe() {
	return tieuDe;
}
public void setTieuDe(String tieuDe) {
	this.tieuDe = tieuDe;
}
public String getNoiDungNgan() {
	return noiDungNgan;
}
public void setNoiDungNgan(String noiDungNgan) {
	this.noiDungNgan = noiDungNgan;
}
public String getNoiDung() {
	return noiDung;
}
public void setNoiDung(String noiDung) {
	this.noiDung = noiDung;
}
public Date getNgayDang() {
	return ngayDang;
}
public void setNgayDang(Date ngayDang) {
	this.ngayDang = ngayDang;
}
public TinTucEntity(String id_TT, ToTruongEntity username, String tieuDe, String noiDungNgan, String noiDung, Date ngayDang) {
	super();
	this.id_TT = id_TT;
	this.username = username;
	this.tieuDe = tieuDe;
	this.noiDungNgan = noiDungNgan;
	this.noiDung = noiDung;
	this.ngayDang = ngayDang;
}

}
