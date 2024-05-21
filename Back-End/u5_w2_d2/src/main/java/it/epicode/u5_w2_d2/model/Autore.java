package it.epicode.u5_w2_d2.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Autore {
    private int id;
    private static int cont;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private String avatar;

    public Autore(String cognome, LocalDate dataDiNascita, String email, String nome) {
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.email = email;
        this.nome = nome;
        cont++;
        id=cont;
        this.avatar = "https://ui-avatars.com/api/?name="+nome+"+"+cognome;
    }
}
