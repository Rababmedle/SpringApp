package com.example.BnidarkApp.Controllers;

import com.example.BnidarkApp.Entity.SocietesMateriaux;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.example.BnidarkApp.Services.SocietesMateriauxService;

@RestController
@RequestMapping("/materiaux")
public class SocietesMateriauxController {

    private final SocietesMateriauxService societesMateriauxService;

    @Autowired
    public SocietesMateriauxController(SocietesMateriauxService societesMateriauxService) {
        this.societesMateriauxService = societesMateriauxService;
    }

    @GetMapping
    public ResponseEntity<List<SocietesMateriaux>> getAllSocietesMateriaux() {
        List<SocietesMateriaux> societesList = societesMateriauxService.getAllSocietesMateriaux();
        return new ResponseEntity<>(societesList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SocietesMateriaux> getSocietesMateriauxById(@PathVariable Integer id) {
        Optional<SocietesMateriaux> societes = societesMateriauxService.getSocietesMateriauxById(id);
        return societes.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<SocietesMateriaux> addSocietesMateriaux(@RequestBody SocietesMateriaux societesMateriaux) {
        SocietesMateriaux newSocietesMateriaux = societesMateriauxService.saveSocietesMateriaux(societesMateriaux);
        return new ResponseEntity<>(newSocietesMateriaux, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSocietesMateriaux(@PathVariable Integer id) {
        societesMateriauxService.deleteSocietesMateriaux(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
