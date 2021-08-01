package net.mock.ma;

import java.util.Date;

public class GTVModelAttribute {
	private String id_GiayTamVang;
	
	private String id_nk, noiDi,lyDo;
	private Date ngayTamVang;
	private String trangthai;
	
	
	

	public GTVModelAttribute(String id_GiayTamVang, String id_nk, String noiDi, String lyDo, Date ngayTamVang,
			String trangthai) {
		super();
		this.id_GiayTamVang = id_GiayTamVang;
		this.id_nk = id_nk;
		this.noiDi = noiDi;
		this.lyDo = lyDo;
		this.ngayTamVang = ngayTamVang;
		this.trangthai = trangthai;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getId_GiayTamVang() {
		return id_GiayTamVang;
	}
	public void setId_GiayTamVang(String id_GiayTamVang) {
		this.id_GiayTamVang = id_GiayTamVang;
	}
	
	
	public String getId_nk() {
		return id_nk;
	}
	public void setId_nk(String id_nk) {
		this.id_nk = id_nk;
	}
	public String getNoiDi() {
		return noiDi;
	}
	public void setNoiDi(String noiDi) {
		this.noiDi = noiDi;
	}
	public String getLyDo() {
		return lyDo;
	}
	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}
	public Date getNgayTamVang() {
		return ngayTamVang;
	}
	public void setNgayTamVang(Date ngayTamVang) {
		this.ngayTamVang = ngayTamVang;
	}
	public GTVModelAttribute(String id_nk, String noiDi, String lyDo, Date ngayTamVang) {
		super();
		this.id_nk = id_nk;
		this.noiDi = noiDi;
		this.lyDo = lyDo;
		this.ngayTamVang = ngayTamVang;
	}
	public GTVModelAttribute() {
		super();
	}
	
}
