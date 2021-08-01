package net.mock.entity;

import java.util.Date;

public class GBTEntity {
	private String id_gbt, lyDo, tenNguoiLamGiay, note, noiMat, trangthai;
	private Date ngayMat;
	private int tuoi;
	private NhanKhauEntity id_nk;

	public String getId_gbt() {
		return id_gbt;
	}

	public void setId_gbt(String id_gbt) {
		this.id_gbt = id_gbt;
	}

	public String getLyDo() {
		return lyDo;
	}

	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}

	public String getTenNguoiLamGiay() {
		return tenNguoiLamGiay;
	}

	public void setTenNguoiLamGiay(String tenNguoiLamGiay) {
		this.tenNguoiLamGiay = tenNguoiLamGiay;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getNgayMat() {
		return ngayMat;
	}

	public void setNgayMat(Date ngayMat) {
		this.ngayMat = ngayMat;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public NhanKhauEntity getId_nk() {
		return id_nk;
	}

	public void setId_nk(NhanKhauEntity id_nk) {
		this.id_nk = id_nk;
	}

	public String getNoiMat() {
		return noiMat;
	}

	public void setNoiMat(String noiMat) {
		this.noiMat = noiMat;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public GBTEntity() {
		super();
	}

//	public GBTEntity(String id_gbt, String lyDo, String tenNguoiLamGiay, String note, String noiMat, Date ngayMat,
//			int tuoi, NhanKhauEntity id_nk) {
//		super();
//		this.id_gbt = id_gbt;
//		this.lyDo = lyDo;
//		this.tenNguoiLamGiay = tenNguoiLamGiay;
//		this.note = note;
//		this.noiMat = noiMat;
//		this.ngayMat = ngayMat;
//		this.tuoi = tuoi;
//		this.id_nk = id_nk;
//	}
//
//	public GBTEntity(String id_gbt, String lyDo, String tenNguoiLamGiay, String note, String noiMat, int tuoi,
//			NhanKhauEntity id_nk) {
//		super();
//		this.id_gbt = id_gbt;
//		this.lyDo = lyDo;
//		this.tenNguoiLamGiay = tenNguoiLamGiay;
//		this.note = note;
//		this.noiMat = noiMat;
//		this.tuoi = tuoi;
//		this.id_nk = id_nk;
//	}

	public GBTEntity(String id_gbt, String lyDo, String tenNguoiLamGiay, String note, String noiMat, String trangthai,
			Date ngayMat, int tuoi, NhanKhauEntity id_nk) {
		super();
		this.id_gbt = id_gbt;
		this.lyDo = lyDo;
		this.tenNguoiLamGiay = tenNguoiLamGiay;
		this.note = note;
		this.noiMat = noiMat;
		this.trangthai = trangthai;
		this.ngayMat = ngayMat;
		this.tuoi = tuoi;
		this.id_nk = id_nk;
	}

}
