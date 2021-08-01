package net.mock.ma;

public class searchNKModelAttribute {
	 private String to,diaChi,id_SHK,tenCMND,soCMND;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getId_SHK() {
		return id_SHK;
	}

	public void setId_SHK(String id_SHK) {
		this.id_SHK = id_SHK;
	}

	public String getTenCMND() {
		return tenCMND;
	}

	public void setTenCMND(String tenCMND) {
		this.tenCMND = tenCMND;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public searchNKModelAttribute() {
		super();
	}

	public searchNKModelAttribute(String to, String diaChi, String id_SHK, String tenCMND, String soCMND) {
		super();
		this.to = to;
		this.diaChi = diaChi;
		this.id_SHK = id_SHK;
		this.tenCMND = tenCMND;
		this.soCMND = soCMND;
	}
	 
}
