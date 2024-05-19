package it.epicode.u5_w1_d5_GestionePrenotazioni.repository;

import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio,Long> {
}
