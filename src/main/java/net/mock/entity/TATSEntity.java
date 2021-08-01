package net.mock.entity;

import java.util.Date;

public class TATSEntity {
	private String id_TATS,loaiHinh,lyDo,note;
	private Date ngayDi,ngayVe;
	private NhanKhauEntity id_nk;
	
				
	public TATSEntity() {
		super();
	}
	
	
	
	public TATSEntity(String id_TATS, String loaiHinh, String lyDo, String note, Date ngayDi, Date ngayVe,
			NhanKhauEntity id_nk) {
		super();
		this.id_TATS = id_TATS;
		this.loaiHinh = loaiHinh;
		this.lyDo = lyDo;
		this.note = note;
		this.ngayDi = ngayDi;
		this.ngayVe = ngayVe;
		this.id_nk = id_nk;
	}
	
	
	
	public String getId_TATS() {
		return id_TATS;
	}
	public void setId_TATS(String id_TATS) {
		this.id_TATS = id_TATS;
	}
	public String getLoaiHinh() {
		return loaiHinh;
	}
	public void setLoaiHinh(String loaiHinh) {
		this.loaiHinh = loaiHinh;
	}
	public String getLyDo() {
		return lyDo;
	}
	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
	public NhanKhauEntity getId_nk() {
		return id_nk;
	}
	public void setId_nk(NhanKhauEntity id_nk) {
		this.id_nk = id_nk;
	}

	
}
