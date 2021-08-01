package net.mock.ma;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class CMNDNhanKhauModelAttribute {

	private String trinhDoVanHoa, ngheNghiep, noiLamViec, quanHeVoiChuHo;
	private Date ngaySHK;
	private String id_SHK;
	private MultipartFile anh;
	private String tenCMND, danToc, tonGiao, noiLamCMND, note;
	private Date ngayCapCMND;
	private String soGKS;

	public CMNDNhanKhauModelAttribute() {
		super();
	}

	public CMNDNhanKhauModelAttribute(String trinhDoVanHoa, String ngheNghiep, String noiLamViec, String quanHeVoiChuHo,
			Date ngaySHK, String id_SHK, MultipartFile anh, String tenCMND, String danToc, String tonGiao,
			String noiLamCMND, String note, Date ngayCapCMND, String soGKS) {
		super();
		this.trinhDoVanHoa = trinhDoVanHoa;
		this.ngheNghiep = ngheNghiep;
		this.noiLamViec = noiLamViec;
		this.quanHeVoiChuHo = quanHeVoiChuHo;
		this.ngaySHK = ngaySHK;
		this.id_SHK = id_SHK;
		this.anh = anh;
		this.tenCMND = tenCMND;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.noiLamCMND = noiLamCMND;
		this.note = note;
		this.ngayCapCMND = ngayCapCMND;
		this.soGKS = soGKS;
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

	public Date getNgaySHK() {
		return ngaySHK;
	}

	public void setNgaySHK(Date ngaySHK) {
		this.ngaySHK = ngaySHK;
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

	public String getTenCMND() {
		return tenCMND;
	}

	public void setTenCMND(String tenCMND) {
		this.tenCMND = tenCMND;
	}

	public String getDanToc() {
		return danToc;
	}

	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}

	public String getTonGiao() {
		return tonGiao;
	}

	public void setTonGiao(String tonGiao) {
		this.tonGiao = tonGiao;
	}

	public String getNoiLamCMND() {
		return noiLamCMND;
	}

	public void setNoiLamCMND(String noiLamCMND) {
		this.noiLamCMND = noiLamCMND;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getNgayCapCMND() {
		return ngayCapCMND;
	}

	public void setNgayCapCMND(Date ngayCapCMND) {
		this.ngayCapCMND = ngayCapCMND;
	}

	public String getSoGKS() {
		return soGKS;
	}

	public void setSoGKS(String soGKS) {
		this.soGKS = soGKS;
	}

}
