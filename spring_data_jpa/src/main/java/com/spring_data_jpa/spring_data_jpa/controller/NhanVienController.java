package com.spring_data_jpa.spring_data_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_data_jpa.spring_data_jpa.entity.NhanVien;
import com.spring_data_jpa.spring_data_jpa.repository.NhanVienRepository;

@RestController
@RequestMapping("api/nhanvien")
public class NhanVienController {
	
	@Autowired
	private NhanVienRepository repository;
	
	@GetMapping("")
	List<NhanVien> getChuyenBays() {
		return repository.findAll();
	}
}
