package net.mock.ma;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class NhanKhauModelAttribute {

	private String id_NK, trinhDoVanHoa, ngheNghiep, noiLamViec, quanHeVoiChuHo, trangthai;
	private Date ngaySHK;
	private String soGKS;
	private String soCMND;
	private String id_SHK;
	private MultipartFile anh;

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

	public Date getNgaySHK() {
		return ngaySHK;
	}

	public void setNgaySHK(Date ngaySHK) {
		this.ngaySHK = ngaySHK;
	}

	public String getSoGKS() {
		return soGKS;
	}

	public void setSoGKS(String soGKS) {
		this.soGKS = soGKS;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getId_SHK() {
		return id_SHK;
	}

	public void setId_SHK(String id_SHK) {
		this.id_SHK = id_SHK;
	}

	public MultipartFile getAnh() {
		return anh;
	}

	public void setAnh(MultipartFile anh) {
		this.anh = anh;
	}

	public NhanKhauModelAttribute(String id_NK, String trinhDoVanHoa, String ngheNghiep, String noiLamViec,
			String quanHeVoiChuHo, String trangthai, Date ngaySHK, String soGKS, String soCMND, String id_SHK,
			MultipartFile anh) {
		super();
		this.id_NK = id_NK;
		this.trinhDoVanHoa = trinhDoVanHoa;
		this.ngheNghiep = ngheNghiep;
		this.noiLamViec = noiLamViec;
		this.quanHeVoiChuHo = quanHeVoiChuHo;
		this.trangthai = trangthai;
		this.ngaySHK = ngaySHK;
		this.soGKS = soGKS;
		this.soCMND = soCMND;
		this.id_SHK = id_SHK;
		this.anh = anh;
	}

	public NhanKhauModelAttribute() {
		super();
	}

}
