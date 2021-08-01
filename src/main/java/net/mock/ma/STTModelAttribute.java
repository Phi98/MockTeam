package net.mock.ma;

import java.util.Date;

public class STTModelAttribute {
	private String id_TamTru, trangThai, lyDo;
	private Date ngayDi, ngayVe;
	private String soCMND;
	private String id_SHK;

	public String getId_TamTru() {
		return id_TamTru;
	}

	public void setId_TamTru(String id_TamTru) {
		this.id_TamTru = id_TamTru;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public String getLyDo() {
		return lyDo;
	}

	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
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

	public STTModelAttribute() {
		super();
	}

	public STTModelAttribute(String id_TamTru, String trangThai, String lyDo, Date ngayDi, Date ngayVe, String soCMND,
			String id_SHK) {
		super();
		this.id_TamTru = id_TamTru;
		this.trangThai = trangThai;
		this.lyDo = lyDo;
		this.ngayDi = ngayDi;
		this.ngayVe = ngayVe;
		this.soCMND = soCMND;
		this.id_SHK = id_SHK;
	}

}
