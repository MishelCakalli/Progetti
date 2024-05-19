package it.epicode.u5_w1_d5_GestionePrenotazioni.beans;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String nomeCompleto;
    private String email;
}