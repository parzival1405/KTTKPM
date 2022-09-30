package com.spring_data_jpa.spring_data_jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
	@Column(name = "MaMB ")
	private int maMB;
	@Column(name = "Loai")
	private String loai;
	@Column(name = "TamBay")
	private int tamBay;
	
	
	@OneToMany(mappedBy = "mayBay", cascade = CascadeType.ALL)
	private List<ChungNhan> ChungNhans;


	public int getMaMB() {
		return maMB;
	}


	public void setMaMB(int maMB) {
		this.maMB = maMB;
	}


	public String getLoai() {
		return loai;
	}


	public void setLoai(String loai) {
		this.loai = loai;
	}


	public int getTamBay() {
		return tamBay;
	}


	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}


	public List<ChungNhan> getChungNhans() {
		return ChungNhans;
	}


	public void setChungNhans(List<ChungNhan> chungNhans) {
		ChungNhans = chungNhans;
	}


	@Override
	public String toString() {
		return "MayBay [maMB=" + maMB + ", loai=" + loai + ", tamBay=" + tamBay + ", ChungNhans=" + ChungNhans + "]";
	}
	
	
}
