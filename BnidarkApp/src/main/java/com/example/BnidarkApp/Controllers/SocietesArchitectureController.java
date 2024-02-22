package com.example.BnidarkApp.Controllers;

import com.example.BnidarkApp.Entity.SocietesArchitecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.example.BnidarkApp.Services.SocietesArchitectureService;

@RestController
@RequestMapping("/societes")
public class SocietesArchitectureController {

    private final SocietesArchitectureService societesArchitectureService;

    @Autowired
    public SocietesArchitectureController(SocietesArchitectureService societesArchitectureService) {
        this.societesArchitectureService = societesArchitectureService;
    }
    @PutMapping("/{id}")
    public ResponseEntity<SocietesArchitecture> updateSocietesArchitecture(@PathVariable Integer id, @RequestBody SocietesArchitecture newSocietesArchitecture) {
        SocietesArchitecture updatedSocietes = societesArchitectureService.updateSocietesArchitecture(id, newSocietesArchitecture);
        if (updatedSocietes != null) {
            return new ResponseEntity<>(updatedSocietes, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<SocietesArchitecture>> getAllSocietes() {
        List<SocietesArchitecture> societesList = societesArchitectureService.getAllSocietesArchitecture();
        return new ResponseEntity<>(societesList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SocietesArchitecture> getSocietesById(@PathVariable Integer id) {
        Optional<SocietesArchitecture> societes = societesArchitectureService.getSocietesArchitectureById(id);
        return societes.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping
    public ResponseEntity<SocietesArchitecture> addSocietes(@RequestBody SocietesArchitecture societes) {
        SocietesArchitecture newSocietes = societesArchitectureService.saveSocietesArchitecture(societes);
        return new ResponseEntity<>(newSocietes, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSocietes(@PathVariable Integer id) {
        societesArchitectureService.deleteSocietesArchitecture(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
