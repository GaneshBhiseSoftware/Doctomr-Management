package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService ds;

	@PostMapping("add")
	public String addDoctor(@RequestBody Doctor doctor) {
		return ds.save(doctor);
	}

	@DeleteMapping("delete/{dId}")
	public String deleteDoctor(@PathVariable int dId) {
		return ds.delete(dId);
	}

	@GetMapping("get/{dId}")
	public Doctor getDoctor(@PathVariable int dId) {
		return ds.getDoctor(dId);
	}
}
