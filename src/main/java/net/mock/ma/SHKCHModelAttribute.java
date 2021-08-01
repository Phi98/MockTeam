package net.mock.ma;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import net.mock.entity.CMNDEntity;
import net.mock.entity.GKSEntity;

public class SHKCHModelAttribute {
	private String  trinhDoVanHoa,ngheNghiep,noiLamViec;
	private Date ngaySHK,ngayCapSo;
	private  String soCMND;
	private String diaChi;
	private MultipartFile anh;
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
	public Date getNgaySHK() {
		return ngaySHK;
	}
	public void setNgaySHK(Date ngaySHK) {
		this.ngaySHK = ngaySHK;
	}
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public Date getNgayCapSo() {
		return ngayCapSo;
	}
	public void setNgayCapSo(Date ngayCapSo) {
		this.ngayCapSo = ngayCapSo;
	}
	public MultipartFile getAnh() {
		return anh;
	}
	public void setAnh(MultipartFile anh) {
		this.anh = anh;
	}
	public SHKCHModelAttribute() {
		super();
	}
	public SHKCHModelAttribute(String trinhDoVanHoa, String ngheNghiep, String noiLamViec, Date ngaySHK, String soCMND,
			String diaChi, Date ngayCapSo, MultipartFile anh) {
		super();
		this.trinhDoVanHoa = trinhDoVanHoa;
		this.ngheNghiep = ngheNghiep;
		this.noiLamViec = noiLamViec;
		this.ngaySHK = ngaySHK;
		this.soCMND = soCMND;
		this.diaChi = diaChi;
		this.ngayCapSo = ngayCapSo;
		this.anh = anh;
	}
	
	

}