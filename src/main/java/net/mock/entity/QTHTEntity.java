package net.mock.entity;

import java.util.Date;

public class QTHTEntity {

	private String id_qtht,trangthai;
	private NhanKhauEntity id_nk;

	private Date ngayBatDau;
	private Date ngayKetThuc;
	private String noiHocTap;
	private String diaChi;

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public QTHTEntity() {
		super();
	}

	public String getId_qtht() {
		return id_qtht;
	}

	public void setId_qtht(String id_qtht) {
		this.id_qtht = id_qtht;
	}

	public NhanKhauEntity getId_nk() {
		return id_nk;
	}

	public QTHTEntity(String id_qtht, NhanKhauEntity id_nk, Date ngayBatDau, Date ngayKetThuc, String noiHocTap,
			String diaChi) {
		super();
		this.id_qtht = id_qtht;
		this.id_nk = id_nk;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.noiHocTap = noiHocTap;
		this.diaChi = diaChi;
	}

	public QTHTEntity(String id_qtht, String trangthai, NhanKhauEntity id_nk, Date ngayBatDau, Date ngayKetThuc,
			String noiHocTap, String diaChi) {
		super();
		this.id_qtht = id_qtht;
		this.trangthai = trangthai;
		this.id_nk = id_nk;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.noiHocTap = noiHocTap;
		this.diaChi = diaChi;
	}

	public void setId_nk(NhanKhauEntity id_nk) {
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

}