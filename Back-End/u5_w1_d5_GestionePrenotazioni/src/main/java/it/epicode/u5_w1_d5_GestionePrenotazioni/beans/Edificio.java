package it.epicode.u5_w1_d5_GestionePrenotazioni.beans;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String indirizzo;
    private String citta;

    @OneToMany(mappedBy = "edificio")
    private List<Postazione> postazioni;
}