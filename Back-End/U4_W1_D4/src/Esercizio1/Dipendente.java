package Esercizio1;

import java.util.ArrayList;

public abstract class Dipendente {
    private String matricola;
    private float stipendio;
    public TipoDiLavoro dipartimento;


    public Dipendente(String matricola,float stipendio,TipoDiLavoro dipartimento){
        this.matricola=matricola;
        this.stipendio=stipendio;
        this.dipartimento=dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public float getStipendio() {
        return stipendio;
    }
}


