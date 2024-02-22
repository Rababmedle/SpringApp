package com.example.BnidarkApp.Services;

import com.example.BnidarkApp.Entity.TerrainsAVendre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.BnidarkApp.Repository.TerrainsAVendreRepository;

@Service
public class TerrainsAVendreService {

    private final TerrainsAVendreRepository terrainsAVendreRepository;

    @Autowired
    public TerrainsAVendreService(TerrainsAVendreRepository terrainsAVendreRepository) {
        this.terrainsAVendreRepository = terrainsAVendreRepository;
    }



    public List<TerrainsAVendre> getAllTerrainsAVendre() {
        return terrainsAVendreRepository.findAll();
    }

    public Optional<TerrainsAVendre> getTerrainAVendreById(Integer id) {
        return terrainsAVendreRepository.findById(id);
    }

    public TerrainsAVendre saveTerrainAVendre(TerrainsAVendre terrainAVendre) {
        return terrainsAVendreRepository.save(terrainAVendre);
    }

    public void deleteTerrainAVendre(Integer id) {
        terrainsAVendreRepository.deleteById(id);
    }
}
