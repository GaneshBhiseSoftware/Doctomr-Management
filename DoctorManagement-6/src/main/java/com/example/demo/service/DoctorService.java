package com.example.demo.service;

import com.example.demo.entity.Doctor;

public interface DoctorService {
    public String save(Doctor doctor);
    public String delete(int dId);
    public Doctor getDoctor(int dId);
}
