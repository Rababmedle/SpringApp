package com.example.BnidarkApp.Services;

import com.example.BnidarkApp.Entity.Administrateur;
import com.example.BnidarkApp.Repository.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministrateurService {


    @Autowired
    private AdministrateurRepository administrateurRepository;




// ajoute la methode update addministratteur
    public List<Administrateur> getAllAdministrateurs() {
        return administrateurRepository.findAll();
    }

    public Optional<Administrateur> getAdministrateurById(Integer id) {
        return administrateurRepository.findById(id);
    }

    public Administrateur saveAdministrateur(Administrateur administrateur) {
        return administrateurRepository.save(administrateur);
    }

    public void deleteAdministrateur(Integer id) {
        administrateurRepository.deleteById(id);
    }

    public Administrateur updateAdministrateur(Integer id, Administrateur updatedAdministrateur) {
        return administrateurRepository.findById(id)
                .map(existingAdministrateur -> {
                    existingAdministrateur.setNomUtilisateur(updatedAdministrateur.getNomUtilisateur());
                    existingAdministrateur.setMotDePasse(updatedAdministrateur.getMotDePasse());
                    existingAdministrateur.setEmail(updatedAdministrateur.getEmail());
                    // Ajoutez d'autres propriétés selon votre modèle Administrateur

                    return administrateurRepository.save(existingAdministrateur);
                })
                .orElseThrow(() -> new RuntimeException("L'administrateur avec l'ID " + id + " n'a pas été trouvé."));
    }
}
