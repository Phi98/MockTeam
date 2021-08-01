package net.mock.entity;

import java.util.Date;

public class GKSEntity {

	private SoHoKhauEntity id_SHK;
	private NhanKhauEntity id_NK;

	private String soGKS, ten, gioiTinh, quocTich, queQuan, noiSinh, tenNguoiLamGiay, noiLamGKS, trangThai, id_cha,
			id_me;
	private Date ngayLamGKS, ngaySinh;

	public String getSoGKS() {
		return soGKS;
	}

	public String getTen() {
		return ten;
	}

	public GKSEntity() {
		super();
	}

	public GKSEntity(String soGKS, String ten, String gioiTinh, String quocTich, String queQuan, String noiSinh,
			String tenNguoiLamGiay, String noiLamGKS, String trangThai, String id_cha, String id_me, Date ngayLamGKS,
			Date ngaySinh) {
		super();
		this.soGKS = soGKS;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.quocTich = quocTich;
		this.queQuan = queQuan;
		this.noiSinh = noiSinh;
		this.tenNguoiLamGiay = tenNguoiLamGiay;
		this.noiLamGKS = noiLamGKS;
		this.trangThai = trangThai;
		this.id_cha = id_cha;
		this.id_me = id_me;
		this.ngayLamGKS = ngayLamGKS;
		this.ngaySinh = ngaySinh;
	}

	public GKSEntity(String soGKS, String gioiTinh, String quocTich, String queQuan, String noiSinh,
			String tenNguoiLamGiay, String noiLamGKS, String trangThai, String id_cha, String id_me) {
		super();
		this.soGKS = soGKS;
		this.gioiTinh = gioiTinh;
		this.quocTich = quocTich;
		this.queQuan = queQuan;
		this.noiSinh = noiSinh;
		this.tenNguoiLamGiay = tenNguoiLamGiay;
		this.noiLamGKS = noiLamGKS;
		this.trangThai = trangThai;
		this.id_cha = id_cha;
		this.id_me = id_me;
	}

	public GKSEntity(String soGKS, String gioiTinh, String quocTich, String queQuan, String noiSinh,
			String tenNguoiLamGiay, String noiLamGKS, String trangThai, String id_cha, String id_me, Date ngayLamGKS,
			Date ngaySinh) {
		super();
		this.soGKS = soGKS;
		this.gioiTinh = gioiTinh;
		this.quocTich = quocTich;
		this.queQuan = queQuan;
		this.noiSinh = noiSinh;
		this.tenNguoiLamGiay = tenNguoiLamGiay;
		this.noiLamGKS = noiLamGKS;
		this.trangThai = trangThai;
		this.id_cha = id_cha;
		this.id_me = id_me;
		this.ngayLamGKS = ngayLamGKS;
		this.ngaySinh = ngaySinh;
	}

	public SoHoKhauEntity getId_SHK() {
		return id_SHK;
	}

	public void setId_SHK(SoHoKhauEntity id_SHK) {
		this.id_SHK = id_SHK;
	}

	public NhanKhauEntity getId_NK() {
		return id_NK;
	}

	public void setId_NK(NhanKhauEntity id_NK) {
		this.id_NK = id_NK;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setSoGKS(String soGKS) {
		this.soGKS = soGKS;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getTenNguoiLamGiay() {
		return tenNguoiLamGiay;
	}

	public void setTenNguoiLamGiay(String tenNguoiLamGiay) {
		this.tenNguoiLamGiay = tenNguoiLamGiay;
	}

	public String getNoiLamGKS() {
		return noiLamGKS;
	}

	public void setNoiLamGKS(String noiLamGKS) {
		this.noiLamGKS = noiLamGKS;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public String getId_cha() {
		return id_cha;
	}

	public void setId_cha(String id_cha) {
		this.id_cha = id_cha;
	}

	public String getId_me() {
		return id_me;
	}

	public void setId_me(String id_me) {
		this.id_me = id_me;
	}

	public Date getNgayLamGKS() {
		return ngayLamGKS;
	}

	public void setNgayLamGKS(Date ngayLamGKS) {
		this.ngayLamGKS = ngayLamGKS;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

}
