package com.example.BnidarkApp.Services;

import com.example.BnidarkApp.Entity.SocietesMateriaux;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.BnidarkApp.Repository.SocietesMateriauxRepository;

@Service
public class SocietesMateriauxService {

    private final SocietesMateriauxRepository societesMateriauxRepository;

    @Autowired
    public SocietesMateriauxService(SocietesMateriauxRepository societesMateriauxRepository) {
        this.societesMateriauxRepository = societesMateriauxRepository;
    }

    public List<SocietesMateriaux> getAllSocietesMateriaux() {
        return societesMateriauxRepository.findAll();
    }

    public Optional<SocietesMateriaux> getSocietesMateriauxById(Integer id) {
        return societesMateriauxRepository.findById(id);
    }

    public SocietesMateriaux saveSocietesMateriaux(SocietesMateriaux societesMateriaux) {
        return societesMateriauxRepository.save(societesMateriaux);
    }

    public void deleteSocietesMateriaux(Integer id) {
        societesMateriauxRepository.deleteById(id);
    }
}
