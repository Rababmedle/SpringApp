package com.example.BnidarkApp.Repository;


import com.example.BnidarkApp.Entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
