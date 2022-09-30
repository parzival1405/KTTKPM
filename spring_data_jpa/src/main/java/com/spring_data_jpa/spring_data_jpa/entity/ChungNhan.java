package com.spring_data_jpa.spring_data_jpa.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "chungnhan")
public class ChungNhan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4194354051265310615L;
	@Id
	@ManyToOne
	@JoinColumn(name = "MaNv")
	private NhanVien nhanVien;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maMb")
	private MayBay mayBay;

//	public NhanVien getNhanVien() {
//		return nhanVien;
//	}
//
//	public void setNhanVien(NhanVien nhanVien) {
//		this.nhanVien = nhanVien;
//	}
//
//	public MayBay getMayBay() {
//		return mayBay;
//	}
//
//	public void setMayBay(MayBay mayBay) {
//		this.mayBay = mayBay;
//	}
//
//	@Override
//	public String toString() {
//		return "ChungNhan [nhanVien=" + nhanVien.getMaNv() + ", mayBay=" + mayBay.getMaMB() + "]";
//	}

}
