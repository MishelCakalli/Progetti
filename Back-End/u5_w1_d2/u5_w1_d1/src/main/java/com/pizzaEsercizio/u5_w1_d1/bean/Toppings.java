package com.pizzaEsercizio.u5_w1_d1.bean;

import lombok.Data;

@Data
public class Toppings extends Menu {
    private String carne;
    private String verdure;
    private String patate;
    private String formaggio;
    private String pesce;

    public Toppings(String carne, String formaggio, String patate, String pesce, String verdure) {
        this.carne = carne;
        this.formaggio = formaggio;
        this.patate = patate;
        this.pesce = pesce;
        this.verdure = verdure;
    }

    public Toppings(double prezzo, String carne, String formaggio, String patate, String pesce, String verdure) {
        super(prezzo);
        this.carne = carne;
        this.formaggio = formaggio;
        this.patate = patate;
        this.pesce = pesce;
        this.verdure = verdure;
    }
    public  Toppings(){

    }
}
