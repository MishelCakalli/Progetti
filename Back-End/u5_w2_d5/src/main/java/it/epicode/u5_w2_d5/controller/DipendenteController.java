package it.epicode.u5_w2_d5.controller;

import it.epicode.u5_w2_d5.model.Dipendente;
import it.epicode.u5_w2_d5.service.DipendenteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/dipendenti")
public class DipendenteController {
    @Autowired
    private DipendenteService dipendenteService;

    @GetMapping
    public List<Dipendente> getAllDipendenti() {
        return dipendenteService.getAllDipendenti();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dipendente> getDipendenteById(@PathVariable(value = "id") Long id) {
        Dipendente dipendente = dipendenteService.getDipendenteById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Dipendente non trovato con id: " + id));
        return ResponseEntity.ok().body(dipendente);
    }

    @PostMapping
    public Dipendente createDipendente(@Valid @RequestBody Dipendente dipendente) {
        return dipendenteService.createDipendente(dipendente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dipendente> updateDipendente(@PathVariable(value = "id") Long id,
                                                       @Valid @RequestBody Dipendente dipendenteDetails) {
        Dipendente updatedDipendente = dipendenteService.updateDipendente(id, dipendenteDetails);
        return ResponseEntity.ok(updatedDipendente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDipendente(@PathVariable(value = "id") Long id) {
        dipendenteService.deleteDipendente(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/uploadImmagine/{id}")
    public ResponseEntity<String> uploadImmagineProfilo(@PathVariable(value = "id") Long id,
                                                        @RequestParam("file") MultipartFile file) {
        Dipendente dipendente = dipendenteService.getDipendenteById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Dipendente non trovato: " + id));

        String filePath = "/uploadImmagine/{id}/immagineProfilo/"+ file.getOriginalFilename();
        dipendente.setImmagineProfilo(filePath);

        dipendenteService.updateDipendente(id, dipendente);

        return ResponseEntity.ok("Immagine caricata");
    }
}