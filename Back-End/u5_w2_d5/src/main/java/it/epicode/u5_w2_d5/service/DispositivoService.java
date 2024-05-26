package it.epicode.u5_w2_d5.service;

import it.epicode.u5_w2_d5.model.Dipendente;
import it.epicode.u5_w2_d5.model.Dispositivo;
import it.epicode.u5_w2_d5.repository.DipendenteRepository;
import it.epicode.u5_w2_d5.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DispositivoService {
    @Autowired
    private DispositivoRepository dispositivoRepository;
    private DipendenteRepository dipendenteRepository;

    public List<Dispositivo> getAllDispositivi() {
        return dispositivoRepository.findAll();
    }

    public Optional<Dispositivo> getDispositivoById(Long id) {
        return dispositivoRepository.findById(id);
    }

    public Dispositivo createDispositivo(Dispositivo dispositivo) {
        return dispositivoRepository.save(dispositivo);
    }

    public Dispositivo updateDispositivo(Long id, Dispositivo dispositivoDetails) {
        Dispositivo dispositivo = dispositivoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Dispositivo non trovato con id: " + id));

        dispositivo.setTipo(dispositivoDetails.getTipo());
        dispositivo.setStato(dispositivoDetails.getStato());
        dispositivo.setDipendente(dispositivoDetails.getDipendente());

        return dispositivoRepository.save(dispositivo);
    }

    public void deleteDispositivo(Long id) {
        Dispositivo dispositivo = dispositivoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Dispositivo non trovato con id: " + id));
        dispositivoRepository.delete(dispositivo);
    }

    public Dispositivo assignDispositivoToDipendente(Long dispositivoId, Long dipendenteId) {
        Dispositivo dispositivo = dispositivoRepository.findById(dispositivoId)
                .orElseThrow(() -> new ResourceNotFoundException("Dispositivo non trovato con: " + dispositivoId));

        Dipendente dipendente = dipendenteRepository.findById(dipendenteId)
                .orElseThrow(() -> new ResourceNotFoundException("Dipendente non trovato con: " + dipendenteId));

        dispositivo.setDipendente(dipendente);
        dispositivo.setStato("Finito");

        return dispositivoRepository.save(dispositivo);
    }
}