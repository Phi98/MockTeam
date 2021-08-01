package net.mock.ma;

import java.util.Date;



public class QTHTModelAttribute {
	private String id_qtht;
	private String id_nk;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	private String noiHocTap;
	private String diaChi;
	private String trangthai;
	
	
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getId_qtht() {
		return id_qtht;
	}
	public void setId_qtht(String id_qtht) {
		this.id_qtht = id_qtht;
	}
	public String getId_nk() {
		return id_nk;
	}
	public void setId_nk(String id_nk) {
		this.id_nk = id_nk;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	public String getNoiHocTap() {
		return noiHocTap;
	}
	public void setNoiHocTap(String noiHocTap) {
		this.noiHocTap = noiHocTap;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public QTHTModelAttribute(String id_nk, Date ngayBatDau, Date ngayKetThuc, String noiHocTap, String diaChi) {
		super();
		this.id_nk = id_nk;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.noiHocTap = noiHocTap;
		this.diaChi = diaChi;
	}
	public QTHTModelAttribute() {
		super();
	}
	public QTHTModelAttribute(String id_qtht, String id_nk, Date ngayBatDau, Date ngayKetThuc, String noiHocTap,
			String diaChi) {
		super();
		this.id_qtht = id_qtht;
		this.id_nk = id_nk;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.noiHocTap = noiHocTap;
		this.diaChi = diaChi;
	}
	public QTHTModelAttribute(String id_qtht, String id_nk, Date ngayBatDau, Date ngayKetThuc, String noiHocTap,
			String diaChi, String trangthai) {
		super();
		this.id_qtht = id_qtht;
		this.id_nk = id_nk;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.noiHocTap = noiHocTap;
		this.diaChi = diaChi;
		this.trangthai = trangthai;
	}
	
}
