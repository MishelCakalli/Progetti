package it.epicode.u5_w1_d5_GestionePrenotazioni.repository;

import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.Postazione;
import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.Prenotazione;
import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione,Long> {
    List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate data);
    List<Prenotazione> findByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate data);
}
