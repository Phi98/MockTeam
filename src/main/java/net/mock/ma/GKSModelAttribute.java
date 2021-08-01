package net.mock.ma;

import java.util.Date;

import net.mock.entity.NhanKhauEntity;

public class GKSModelAttribute {

	private NhanKhauEntity 	id_nk;
	private String soGKS;
	private String ten, gioiTinh, quocTich, queQuan, noiSinh, tenNguoiLamGiay, noiLamGKS, trangThai, id_cha, id_me;
	private Date ngayLamGKS, ngaySinh;
	private String id_shk;

	public GKSModelAttribute() {
		super();
	}

	public GKSModelAttribute(String ten, String gioiTinh, String quocTich, String queQuan, String noiSinh,
			String tenNguoiLamGiay, String noiLamGKS, String trangThai, String id_cha, String id_me, Date ngayLamGKS,
			Date ngaySinh) {
		super();
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
	
	

	public GKSModelAttribute(NhanKhauEntity id_nk, String soGKS, String ten, String gioiTinh, String quocTich,
			String queQuan, String noiSinh, String tenNguoiLamGiay, String noiLamGKS, String trangThai, String id_cha,
			String id_me, Date ngayLamGKS, Date ngaySinh, String id_shk) {
		super();
		this.id_nk = id_nk;
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
		this.id_shk = id_shk;
	}

	public NhanKhauEntity getId_nk() {
		return id_nk;
	}

	public void setId_nk(NhanKhauEntity id_nk) {
		this.id_nk = id_nk;
	}

	public GKSModelAttribute(String soGKS, String ten, String gioiTinh, String quocTich, String queQuan, String noiSinh,
			String tenNguoiLamGiay, String noiLamGKS, String trangThai, String id_cha, String id_me, Date ngayLamGKS,
			Date ngaySinh, String id_shk) {
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
		this.id_shk = id_shk;
	}

	public String getSoGKS() {
		return soGKS;
	}

	public void setSoGKS(String soGKS) {
		this.soGKS = soGKS;
	}

	public String getTen() {
		return ten;
	}

	public String getId_shk() {
		return id_shk;
	}

	public void setId_shk(String id_shk) {
		this.id_shk = id_shk;
	}

	public void setTen(String ten) {
		this.ten = ten;
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
