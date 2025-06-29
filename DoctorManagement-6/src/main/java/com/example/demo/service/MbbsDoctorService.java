package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepo;

@Service
public class MbbsDoctorService implements DoctorService {

    @Autowired
    private DoctorRepo dr;

    @Override
    public String save(Doctor doctor) {
        dr.save(doctor);
        return "Doctor saved successfully!";
    }

    @Override
    public String delete(int dId) {
        if (dr.existsById(dId)) {
            dr.deleteById(dId);
            return "Doctor deleted successfully!";
        } else {
            return "Doctor ID not found!";
        }
    }

    @Override
    public Doctor getDoctor(int dId) {
        return dr.findById(dId).orElse(null);
    }
}
