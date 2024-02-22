package com.example.BnidarkApp.Services;

import com.example.BnidarkApp.Entity.SocietesArchitecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.BnidarkApp.Repository.SocietesArchitectureRepository;

@Service
public class SocietesArchitectureService {

    private final SocietesArchitectureRepository societesArchitectureRepository;

    @Autowired
    public SocietesArchitectureService(SocietesArchitectureRepository societesArchitectureRepository) {
        this.societesArchitectureRepository = societesArchitectureRepository;
    }

    public List<SocietesArchitecture> getAllSocietesArchitecture() {
        return societesArchitectureRepository.findAll();
    }

    public Optional<SocietesArchitecture> getSocietesArchitectureById(Integer id) {
        return societesArchitectureRepository.findById(id);
    }

    public SocietesArchitecture saveSocietesArchitecture(SocietesArchitecture societesArchitecture) {
        return societesArchitectureRepository.save(societesArchitecture);
    }
    public SocietesArchitecture updateSocietesArchitecture(Integer id, SocietesArchitecture newSocietesArchitecture) {
        Optional<SocietesArchitecture> existingSocietes = societesArchitectureRepository.findById(id);

        if (existingSocietes.isPresent()) {
            SocietesArchitecture currentSocietes = existingSocietes.get();
            currentSocietes.setNom(newSocietesArchitecture.getNom());
            currentSocietes.setAdresse(newSocietesArchitecture.getAdresse());
            currentSocietes.setContact(newSocietesArchitecture.getContact());
            // Ajoutez d'autres modifications si nécessaire

            return societesArchitectureRepository.save(currentSocietes);
        } else {
            // Gérer le cas où l'entité n'est pas trouvée
            // Vous pouvez lancer une exception ou retourner null/une entité par défaut, selon votre logique métier
            return null;
        }
    }

    // ... autres méthodes du service

    public void deleteSocietesArchitecture(Integer id) {
        societesArchitectureRepository.deleteById(id);
    }
}
