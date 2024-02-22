package com.example.BnidarkApp.Controllers;

import com.example.BnidarkApp.Entity.Administrateur;
import com.example.BnidarkApp.Services.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrateurs")
public class AdministrateurController {

    @Autowired
    private AdministrateurService administrateurService;

    @GetMapping
    public List<Administrateur> getAllAdministrateurs() {
        return administrateurService.getAllAdministrateurs();
    }

    @GetMapping("/{id}")
    public Administrateur getAdministrateurById(@PathVariable Integer id) {
        return administrateurService.getAdministrateurById(id).orElse(null);
    }
//ajout du
    @PostMapping
    public Administrateur saveAdministrateur(@RequestBody Administrateur administrateur) {
        return administrateurService.saveAdministrateur(administrateur);
    }

    @PutMapping("/{id}")
    public Administrateur updateAdministrateur(@PathVariable Integer id, @RequestBody Administrateur updatedAdministrateur) {
        return administrateurService.updateAdministrateur(id, updatedAdministrateur);
    }

    @DeleteMapping("/{id}")
    public void deleteAdministrateur(@PathVariable Integer id) {
        administrateurService.deleteAdministrateur(id);
    }
}
