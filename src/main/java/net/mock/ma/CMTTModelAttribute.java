package net.mock.ma;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class CMTTModelAttribute {


	private String id_SHK;
	private MultipartFile anh;
	private String tenCMND, danToc, tonGiao, noiLamCMND, note,lyDo, soCMND;
	private Date ngayCapCMND,ngayDi,ngayVe;
	
	public String getSoCMND() {
		return soCMND;
	}
	
	public CMTTModelAttribute() {
		super();
	}

	public CMTTModelAttribute(String id_SHK, MultipartFile anh, String tenCMND, String danToc, String tonGiao,
			String noiLamCMND, String note, String lyDo, String soCMND, Date ngayCapCMND, Date ngayDi, Date ngayVe) {
		super();
		this.id_SHK = id_SHK;
		this.anh = anh;
		this.tenCMND = tenCMND;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.noiLamCMND = noiLamCMND;
		this.note = note;
		this.lyDo = lyDo;
		this.soCMND = soCMND;
		this.ngayCapCMND = ngayCapCMND;
		this.ngayDi = ngayDi;
		this.ngayVe = ngayVe;
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
	public String getLyDo() {
		return lyDo;
	}
	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}
	public Date getNgayCapCMND() {
		return ngayCapCMND;
	}
	public void setNgayCapCMND(Date ngayCapCMND) {
		this.ngayCapCMND = ngayCapCMND;
	}
	public Date getNgayDi() {
		return ngayDi;
	}
	public void setNgayDi(Date ngayDi) {
		this.ngayDi = ngayDi;
	}
	public Date getNgayVe() {
		return ngayVe;
	}
	public void setNgayVe(Date ngayVe) {
		this.ngayVe = ngayVe;
	}
	
	public CMTTModelAttribute(String id_SHK, MultipartFile anh, String tenCMND, String danToc, String tonGiao,
			String noiLamCMND, String note, String lyDo, Date ngayCapCMND, Date ngayDi, Date ngayVe) {
		super();
		this.id_SHK = id_SHK;
		this.anh = anh;
		this.tenCMND = tenCMND;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.noiLamCMND = noiLamCMND;
		this.note = note;
		this.lyDo = lyDo;
		this.ngayCapCMND = ngayCapCMND;
		this.ngayDi = ngayDi;
		this.ngayVe = ngayVe;
	}

}