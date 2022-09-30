package com.spring_data_jpa.spring_data_jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
	@Id
	@Column(name = "MaNV")
	private String maNv;
	@Column(name = "Ten")
	private String ten;
	@Column(name = "Luong")
	private int luong;
	
	@OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL)
	private List<ChungNhan> ChungNhans;

	public String getMaNv() {
		return maNv;
	}

	public void setMaNv(String maNv) {
		this.maNv = maNv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public List<ChungNhan> getChungNhans() {
		return ChungNhans;
	}

	public void setChungNhans(List<ChungNhan> chungNhans) {
		ChungNhans = chungNhans;
	}

	@Override
	public String toString() {
		return "NhanVien [maNv=" + maNv + ", ten=" + ten + ", luong=" + luong +  "]";
	}
	
	
	
	
}
