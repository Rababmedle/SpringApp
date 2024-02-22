package com.example.BnidarkApp.Repository;

import com.example.BnidarkApp.Entity.SocietesArchitecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocietesArchitectureRepository extends JpaRepository<SocietesArchitecture, Integer> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
