package Esercizio.entity;

import org.hibernate.annotations.Check;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity//la classe diventa una tabella
@Table(name = "evento")//aggiunge informazioni aggiuntive alla tabella  (e' una convezione)
public class Evento {
    @Id
    @GeneratedValue
    private int id;
    private String titolo;
    @Column(name = "data_evento")
    private LocalDate dataEvento;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_evento",length=30 )
    private TipoEvento tipoEvento;
    @Column(name = "numero_massimo_partecipanti")
    private int numeroMassimoPartecipanti;

    public Evento(int id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti) {
        this.id = id;
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }
    public Evento(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}
