package net.mock.entity;

import java.util.Date;

public class STTEntity {
	private String id_TamTru,trangThai,lyDo;
	private Date ngayDi,ngayVe;
	private CMNDEntity soCMND;
	private SoHoKhauEntity id_SHK;
	public String getId_TamTru() {
		return id_TamTru;
	}
	public void setId_TamTru(String id_TamTru) {
		this.id_TamTru = id_TamTru;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getLyDo() {
		return lyDo;
	}
	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}
	public Date getNgayDi() {
		return ngayDi;
	}
	public void setNgayDi(Date ngayDi) {
		this.ngayDi = ngayDi;
	}
	public Date getNgayVe() {
		return ngayVe;
	}
	public void setNgayVe(Date ngayVe) {
		this.ngayVe = ngayVe;
	}
	public CMNDEntity getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(CMNDEntity soCMND) {
		this.soCMND = soCMND;
	}
	public SoHoKhauEntity getId_SHK() {
		return id_SHK;
	}
	public void setId_SHK(SoHoKhauEntity id_SHK) {
		this.id_SHK = id_SHK;
	}
	
	public STTEntity() {
		super();
	}
	public STTEntity(String id_TamTru, String trangThai, String lyDo, Date ngayDi, Date ngayVe, CMNDEntity soCMND,
			SoHoKhauEntity id_SHK) {
		super();
		this.id_TamTru = id_TamTru;
		this.trangThai = trangThai;
		this.lyDo = lyDo;
		this.ngayDi = ngayDi;
		this.ngayVe = ngayVe;
		this.soCMND = soCMND;
		this.id_SHK = id_SHK;
	}
	
}
