package com.example.BnidarkApp.Repository;

import com.example.BnidarkApp.Entity.SocietesMateriaux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocietesMateriauxRepository extends JpaRepository<SocietesMateriaux, Integer> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
