package net.mock.ma;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class CMNDModelAttribute {
	private String soCMND, tenCMND, danToc, tonGiao, noiLamCMND, note;
	private Date ngayCapCMND;
	private String soGKS;
	private MultipartFile anh;
	public CMNDModelAttribute() {
		super();
	}
	public CMNDModelAttribute(String tenCMND, String danToc, String tonGiao, String noiLamCMND,
			String note, Date ngayCapCMND, String soGKS, MultipartFile anh) {
		super();
		this.tenCMND = tenCMND;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.noiLamCMND = noiLamCMND;
		this.note = note;
		this.ngayCapCMND = ngayCapCMND;
		this.soGKS = soGKS;
		this.anh = anh;

	}
	
	
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
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
	public MultipartFile getAnh() {
		return anh;
	}
	public void setAnh(MultipartFile anh) {
		this.anh = anh;
	}


	

}
