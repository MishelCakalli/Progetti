package it.epicode.u5_w1_d5_GestionePrenotazioni.repository;

import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente,Long> {
}
