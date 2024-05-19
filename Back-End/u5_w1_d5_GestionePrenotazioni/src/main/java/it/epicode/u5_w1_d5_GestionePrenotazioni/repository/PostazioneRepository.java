package it.epicode.u5_w1_d5_GestionePrenotazioni.repository;

import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.Postazione;
import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione,Long> {
    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);
}
