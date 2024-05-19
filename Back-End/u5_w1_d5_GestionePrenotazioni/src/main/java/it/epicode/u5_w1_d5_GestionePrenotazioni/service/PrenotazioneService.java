package it.epicode.u5_w1_d5_GestionePrenotazioni.service;
import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.Postazione;
import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.Prenotazione;
import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.TipoPostazione;
import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.Utente;
import it.epicode.u5_w1_d5_GestionePrenotazioni.repository.PostazioneRepository;
import it.epicode.u5_w1_d5_GestionePrenotazioni.repository.PrenotazioneRepository;
import it.epicode.u5_w1_d5_GestionePrenotazioni.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired
    private PostazioneRepository postazioneRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    public Prenotazione prenotaPostazione(Long utenteId, Long postazioneId, LocalDate data) {
        Optional<Utente> utente = utenteRepository.findById(utenteId);
        Optional<Postazione> postazione = postazioneRepository.findById(postazioneId);

        if (utente.isPresent() && postazione.isPresent()) {
            List<Prenotazione> prenotazioniEsistenti = prenotazioneRepository.findByPostazioneAndDataPrenotazione(postazione.get(), data);
            if (prenotazioniEsistenti.isEmpty()) {
                Prenotazione prenotazione = new Prenotazione();
                prenotazione.setUtente(utente.get());
                prenotazione.setPostazione(postazione.get());
                prenotazione.setDataPrenotazione(data);
                return prenotazioneRepository.save(prenotazione);
            }
        }
        return null;
    }

    public List<Postazione> cercaPostazioni(TipoPostazione tipo, String citta) {
        return postazioneRepository.findByTipoAndEdificio_Citta(tipo, citta);
    }
}
