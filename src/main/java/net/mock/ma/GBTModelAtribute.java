package net.mock.ma;

import java.util.Date;

public class GBTModelAtribute {


	private String id_gbt;
	private String lyDo;
	private String tenNguoiLamGiay;
	private String note;
	private String noiMat;
	private Date ngayMat;
	private String id_nk;
;
	private String trangthai;


	public GBTModelAtribute() {
		super();
	}



	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	
	public String getId_gbt() {
		return id_gbt;
	}

	public void setId_gbt(String id_gbt) {
		this.id_gbt = id_gbt;
	}





	public GBTModelAtribute(String id_gbt, String lyDo, String tenNguoiLamGiay, String note, String noiMat,
			Date ngayMat, String id_nk, int tuoi, String trangthai) {
		super();
		this.id_gbt = id_gbt;
		this.lyDo = lyDo;
		this.tenNguoiLamGiay = tenNguoiLamGiay;
		this.note = note;
		this.noiMat = noiMat;
		this.ngayMat = ngayMat;
		this.id_nk = id_nk;

		this.trangthai = trangthai;
	}



	public GBTModelAtribute(String lyDo, String tenNguoiLamGiay, String note, String noiMat, Date ngayMat, String id_nk,
			int tuoi, String trangthai) {
		super();
		this.lyDo = lyDo;
		this.tenNguoiLamGiay = tenNguoiLamGiay;
		this.note = note;
		this.noiMat = noiMat;
		this.ngayMat = ngayMat;
		this.id_nk = id_nk;

		this.trangthai = trangthai;
	}



	public GBTModelAtribute(String lyDo, String tenNguoiLamGiay, String note, String noiMat, Date ngayMat, String id_nk,
			int tuoi) {
		super();
		this.lyDo = lyDo;
		this.tenNguoiLamGiay = tenNguoiLamGiay;
		this.note = note;
		this.noiMat = noiMat;
		this.ngayMat = ngayMat;
		this.id_nk = id_nk;

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

	public String getNoiMat() {
		return noiMat;
	}

	public void setNoiMat(String noiMat) {
		this.noiMat = noiMat;
	}

	public Date getNgayMat() {
		return ngayMat;
	}

	public void setNgayMat(Date ngayMat) {
		this.ngayMat = ngayMat;
	}

	public String getId_nk() {
		return id_nk;
	}

	public void setId_nk(String id_nk) {
		this.id_nk = id_nk;
	}

}
