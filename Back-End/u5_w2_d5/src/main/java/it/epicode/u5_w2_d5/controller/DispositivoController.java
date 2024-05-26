package it.epicode.u5_w2_d5.controller;


import it.epicode.u5_w2_d5.model.Dispositivo;
import it.epicode.u5_w2_d5.service.DispositivoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dispositivi")
public class DispositivoController {
    @Autowired
    private DispositivoService dispositivoService;

    @GetMapping
    public List<Dispositivo> getAllDispositivi() {
        return dispositivoService.getAllDispositivi();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dispositivo> getDispositivoById(@PathVariable(value = "id") Long id) {
        Dispositivo dispositivo = dispositivoService.getDispositivoById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Dispositivo non trovato con id: " + id));
        return ResponseEntity.ok().body(dispositivo);
    }

    @PostMapping
    public Dispositivo createDispositivo(@Valid @RequestBody Dispositivo dispositivo) {
        return dispositivoService.createDispositivo(dispositivo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dispositivo> updateDispositivo(@PathVariable(value = "id") Long id,
                                                         @Valid @RequestBody Dispositivo dispositivoDetails) {
        Dispositivo updatedDispositivo = dispositivoService.updateDispositivo(id, dispositivoDetails);
        return ResponseEntity.ok(updatedDispositivo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDispositivo(@PathVariable(value = "id") Long id) {
        dispositivoService.deleteDispositivo(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/assegna")
    public ResponseEntity<Dispositivo> assignDispositivo(@PathVariable(value = "id") Long dispositivoId,
                                                         @RequestParam Long dipendenteId) {
        Dispositivo dispositivo = dispositivoService.assignDispositivoToDipendente(dispositivoId, dipendenteId);
        return ResponseEntity.ok(dispositivo);
    }
}