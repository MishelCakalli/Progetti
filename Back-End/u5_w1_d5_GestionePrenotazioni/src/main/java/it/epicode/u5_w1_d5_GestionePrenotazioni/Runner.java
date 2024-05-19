package it.epicode.u5_w1_d5_GestionePrenotazioni;
import it.epicode.u5_w1_d5_GestionePrenotazioni.beans.*;
import it.epicode.u5_w1_d5_GestionePrenotazioni.repository.EdificioRepository;
import it.epicode.u5_w1_d5_GestionePrenotazioni.repository.PostazioneRepository;
import it.epicode.u5_w1_d5_GestionePrenotazioni.repository.PrenotazioneRepository;
import it.epicode.u5_w1_d5_GestionePrenotazioni.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@PropertySource("application.properties")
public class Runner implements CommandLineRunner {
    @Autowired
    private EdificioRepository edificioRepository;

    @Autowired
    private PostazioneRepository postazioneRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Override
    public void run(String... args) throws Exception {
        Edificio edificio1 = new Edificio();
        edificio1.setNome("Edificio 1");
        edificio1.setIndirizzo("Via Roma 1");
        edificio1.setCitta("Milano");
        edificioRepository.save(edificio1);

        Edificio edificio2 = new Edificio();
        edificio2.setNome("Edificio 2");
        edificio2.setIndirizzo("Via Milano 2");
        edificio2.setCitta("Torino");
        edificioRepository.save(edificio2);




        Postazione postazione1 = new Postazione();
        postazione1.setCodiceUnivoco("A001");
        postazione1.setDescrizione("Postazione privata 1");
        postazione1.setTipo(TipoPostazione.PRIVATO);
        postazione1.setNumeroMaxOccupanti(1);
        postazione1.setEdificio(edificio1);
        postazioneRepository.save(postazione1);

        Postazione postazione2 = new Postazione();
        postazione2.setCodiceUnivoco("B002");
        postazione2.setDescrizione("Open space 1");
        postazione2.setTipo(TipoPostazione.OPENSPACE);
        postazione2.setNumeroMaxOccupanti(4);
        postazione2.setEdificio(edificio1);
        postazioneRepository.save(postazione2);

        Postazione postazione3 = new Postazione();
        postazione3.setCodiceUnivoco("C003");
        postazione3.setDescrizione("Sala riunioni 1");
        postazione3.setTipo(TipoPostazione.SALA_RIUNIONI);
        postazione3.setNumeroMaxOccupanti(10);
        postazione3.setEdificio(edificio2);
        postazioneRepository.save(postazione3);





        Utente utente1 = new Utente();
        utente1.setUsername("user1");
        utente1.setNomeCompleto("Mario Rossi");
        utente1.setEmail("mario.rossi@example.com");
        utenteRepository.save(utente1);

        Utente utente2 = new Utente();
        utente2.setUsername("user2");
        utente2.setNomeCompleto("Luca Bianchi");
        utente2.setEmail("luca.bianchi@example.com");
        utenteRepository.save(utente2);




        Prenotazione prenotazione1 = new Prenotazione();
        prenotazione1.setUtente(utente1);
        prenotazione1.setPostazione(postazione1);
        prenotazione1.setDataPrenotazione(LocalDate.now().plusDays(1));
        prenotazioneRepository.save(prenotazione1);

        Prenotazione prenotazione2 = new Prenotazione();
        prenotazione2.setUtente(utente2);
        prenotazione2.setPostazione(postazione2);
        prenotazione2.setDataPrenotazione(LocalDate.now().plusDays(2));
        prenotazioneRepository.save(prenotazione2);
    }
}
