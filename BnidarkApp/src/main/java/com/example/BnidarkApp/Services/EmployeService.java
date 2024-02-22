package com.example.BnidarkApp.Services;


import com.example.BnidarkApp.Entity.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BnidarkApp.Repository.EmployeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class  EmployeService {
    @Autowired
    private EmployeRepository employeRepository;

    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    public Optional<Employe> getEmployeById(Integer id) {
        return employeRepository.findById(id);
    }

    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public void deleteEmploye(Integer id) {
        employeRepository.deleteById(id);
    }
}
