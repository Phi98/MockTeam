package net.mock.entity;

import java.util.Date;

public class STVEntity {
	
	
	private NhanKhauEntity id_nk;
	private String id_GiayTamVang, noiDi,lyDo;
	private Date ngayTamVang;
	private String trangthai;
	

	
	
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
	public String getNoiDi() {
		return noiDi;
	}
	public void setNoiDi(String noiDi) {
		this.noiDi = noiDi;
	}
	public STVEntity() {
		super();
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
	public NhanKhauEntity getId_nk() {
		return id_nk;
	}
	public void setId_nk(NhanKhauEntity id_nk) {
		this.id_nk = id_nk;
	}
	
	public STVEntity(String noiDi, String lyDo, Date ngayTamVang) {
		super();
		this.noiDi = noiDi;
		this.lyDo = lyDo;
		this.ngayTamVang = ngayTamVang;
	}
	
	public STVEntity(String id_GiayTamVang, String noiDi, String lyDo, Date ngayTamVang, String trangthai,
			NhanKhauEntity id_nk) {
		super();
		this.id_GiayTamVang = id_GiayTamVang;
		this.noiDi = noiDi;
		this.lyDo = lyDo;
		this.ngayTamVang = ngayTamVang;
		this.trangthai = trangthai;
		this.id_nk = id_nk;
	}
	public STVEntity(String id_GiayTamVang, String noiDi, String lyDo, Date ngayTamVang, NhanKhauEntity id_nk) {
		super();
		this.id_GiayTamVang = id_GiayTamVang;
		this.noiDi = noiDi;
		this.lyDo = lyDo;
		this.ngayTamVang = ngayTamVang;
		this.id_nk = id_nk;
	}
	
	
}
