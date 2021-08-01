package net.mock.entity;

import java.util.Date;





public class NhanKhauEntity {
	private String id_NK,trinhDoVanHoa,ngheNghiep,noiLamViec,quanHeVoiChuHo,trangthai,anh;
	private Date ngaySHK;
	private GKSEntity soGKS;
	private CMNDEntity soCMND;
	private SoHoKhauEntity id_SHK;
	public String getId_NK() {
		return id_NK;
	}
	public void setId_NK(String id_NK) {
		this.id_NK = id_NK;
	}
	public String getTrinhDoVanHoa() {
		return trinhDoVanHoa;
	}
	public void setTrinhDoVanHoa(String trinhDoVanHoa) {
		this.trinhDoVanHoa = trinhDoVanHoa;
	}
	public String getNgheNghiep() {
		return ngheNghiep;
	}
	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	public String getNoiLamViec() {
		return noiLamViec;
	}
	public void setNoiLamViec(String noiLamViec) {
		this.noiLamViec = noiLamViec;
	}
	public String getQuanHeVoiChuHo() {
		return quanHeVoiChuHo;
	}
	public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
		this.quanHeVoiChuHo = quanHeVoiChuHo;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public Date getNgaySHK() {
		return ngaySHK;
	}
	public void setNgaySHK(Date ngaySHK) {
		this.ngaySHK = ngaySHK;
	
	}
	public GKSEntity getSoGKS() {
		return soGKS;
	}
	public void setSoGKS(GKSEntity soGKS) {
		this.soGKS = soGKS;
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
	
	public NhanKhauEntity() {
		super();
	}
	public NhanKhauEntity(String id_NK, String trinhDoVanHoa, String ngheNghiep, String noiLamViec,
			String quanHeVoiChuHo, String trangthai, String anh, Date ngaySHK, GKSEntity soGKS, CMNDEntity soCMND,
			SoHoKhauEntity id_SHK) {
		super();
		this.id_NK = id_NK;
		this.trinhDoVanHoa = trinhDoVanHoa;
		this.ngheNghiep = ngheNghiep;
		this.noiLamViec = noiLamViec;
		this.quanHeVoiChuHo = quanHeVoiChuHo;
		this.trangthai = trangthai;
		this.anh = anh;
		this.ngaySHK = ngaySHK;
		this.soGKS = soGKS;
		this.soCMND = soCMND;
		this.id_SHK = id_SHK;
	}
	
}

