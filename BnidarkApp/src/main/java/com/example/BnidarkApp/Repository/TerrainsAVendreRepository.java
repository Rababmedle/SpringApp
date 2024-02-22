package com.example.BnidarkApp.Repository;

import com.example.BnidarkApp.Entity.TerrainsAVendre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerrainsAVendreRepository extends JpaRepository<TerrainsAVendre, Integer> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
