package net.mock.entity;

import java.util.Date;

public class CMNDEntity {

	private String soCMND, tenCMND, danToc, tonGiao, noiLamCMND, note, anh, gvt1, gvt2;
	private Date ngayCapCMND;
	private GKSEntity soGKS;

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

	public CMNDEntity(String soCMND, String tenCMND, String danToc, String tonGiao, String noiLamCMND, String note,
			String anh, Date ngayCapCMND) {
		super();
		this.soCMND = soCMND;
		this.tenCMND = tenCMND;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.noiLamCMND = noiLamCMND;
		this.note = note;
		this.anh = anh;
		this.ngayCapCMND = ngayCapCMND;
	}

	public CMNDEntity(String soCMND, String tenCMND, String danToc, String tonGiao, String noiLamCMND, String note,
			String anh, String gvt1, String gvt2, Date ngayCapCMND) {
		super();
		this.soCMND = soCMND;
		this.tenCMND = tenCMND;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.noiLamCMND = noiLamCMND;
		this.note = note;
		this.anh = anh;
		this.gvt1 = gvt1;
		this.gvt2 = gvt2;
		this.ngayCapCMND = ngayCapCMND;
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

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public String getGvt1() {
		return gvt1;
	}

	public void setGvt1(String gvt1) {
		this.gvt1 = gvt1;
	}

	public String getGvt2() {
		return gvt2;
	}

	public void setGvt2(String gvt2) {
		this.gvt2 = gvt2;
	}

	public Date getNgayCapCMND() {
		return ngayCapCMND;
	}

	public void setNgayCapCMND(Date ngayCapCMND) {
		this.ngayCapCMND = ngayCapCMND;
	}

	public GKSEntity getSoGKS() {
		return soGKS;
	}

	public void setSoGKS(GKSEntity soGKS) {
		this.soGKS = soGKS;
	}

	public CMNDEntity() {
		super();
	}

	public CMNDEntity(String soCMND, String tenCMND, String danToc, String tonGiao, String noiLamCMND, String note,
			String anh, String gvt1, String gvt2, Date ngayCapCMND, GKSEntity soGKS) {
		super();
		this.soCMND = soCMND;
		this.tenCMND = tenCMND;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.noiLamCMND = noiLamCMND;
		this.note = note;
		this.anh = anh;
		this.gvt1 = gvt1;
		this.gvt2 = gvt2;
		this.ngayCapCMND = ngayCapCMND;
		this.soGKS = soGKS;
	}

	public CMNDEntity(String soCMND, String tenCMND, String danToc, String tonGiao, String noiLamCMND, String note,
			String anh, Date ngayCapCMND, GKSEntity soGKS) {
		super();
		this.soCMND = soCMND;
		this.tenCMND = tenCMND;
		this.danToc = danToc;
		this.tonGiao = tonGiao;
		this.noiLamCMND = noiLamCMND;
		this.note = note;
		this.anh = anh;
		this.ngayCapCMND = ngayCapCMND;
		this.soGKS = soGKS;
	}
	
	

}
