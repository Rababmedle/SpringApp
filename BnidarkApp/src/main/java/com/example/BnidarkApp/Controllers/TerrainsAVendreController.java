package com.example.BnidarkApp.Controllers;

import com.example.BnidarkApp.Entity.TerrainsAVendre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.example.BnidarkApp.Services.TerrainsAVendreService;

@RestController
@RequestMapping("/terrains")
public class TerrainsAVendreController {

    private final TerrainsAVendreService terrainsAVendreService;

    @Autowired
    public TerrainsAVendreController(TerrainsAVendreService terrainsAVendreService) {
        this.terrainsAVendreService = terrainsAVendreService;
    }


    @GetMapping
    public ResponseEntity<List<TerrainsAVendre>> getAllTerrainsAVendre() {
        List<TerrainsAVendre> terrainsList = terrainsAVendreService.getAllTerrainsAVendre();
        return new ResponseEntity<>(terrainsList, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<TerrainsAVendre> getTerrainAVendreById(@PathVariable Integer id) {
        Optional<TerrainsAVendre> terrain = terrainsAVendreService.getTerrainAVendreById(id);
        return terrain.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<TerrainsAVendre> addTerrainAVendre(@RequestBody TerrainsAVendre terrainAVendre) {
        TerrainsAVendre newTerrainAVendre = terrainsAVendreService.saveTerrainAVendre(terrainAVendre);
        return new ResponseEntity<>(newTerrainAVendre, HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTerrainAVendre(@PathVariable Integer id) {
        terrainsAVendreService.deleteTerrainAVendre(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
