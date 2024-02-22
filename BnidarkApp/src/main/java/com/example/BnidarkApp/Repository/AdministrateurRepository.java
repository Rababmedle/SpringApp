package com.example.BnidarkApp.Repository;

import com.example.BnidarkApp.Entity.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Integer> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
