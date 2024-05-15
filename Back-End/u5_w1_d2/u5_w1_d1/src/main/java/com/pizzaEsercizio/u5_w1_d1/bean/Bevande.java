package com.pizzaEsercizio.u5_w1_d1.bean;

import lombok.Data;

@Data
public class Bevande extends Menu {
    private String bibiteGassate;
    private String alcolici;
    private String analcolici;


    public Bevande(String alcolici, String analcolici, String bibiteGassate) {
        this.alcolici = alcolici;
        this.analcolici = analcolici;
        this.bibiteGassate = bibiteGassate;
    }

    public Bevande(double prezzo, String alcolici, String analcolici, String bibiteGassate) {
        super(prezzo);
        this.alcolici = alcolici;
        this.analcolici = analcolici;
        this.bibiteGassate = bibiteGassate;
    }

    public  Bevande(){

    }
}
