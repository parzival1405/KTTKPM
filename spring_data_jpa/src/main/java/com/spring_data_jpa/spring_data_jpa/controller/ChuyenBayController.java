package com.spring_data_jpa.spring_data_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_data_jpa.spring_data_jpa.entity.ChuyenBay;
import com.spring_data_jpa.spring_data_jpa.repository.ChuyenBayRepository;


@RestController
@RequestMapping("api/chuyenbay")
public class ChuyenBayController {
	
	@Autowired
	private ChuyenBayRepository repository;
	
	@GetMapping("")
	List<ChuyenBay> getChuyenBays() {
		return repository.findAll();
	}
	
}
