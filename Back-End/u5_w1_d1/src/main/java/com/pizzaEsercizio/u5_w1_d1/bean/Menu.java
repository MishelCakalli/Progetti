package com.pizzaEsercizio.u5_w1_d1.bean;

import lombok.Data;

@Data
public abstract class Menu {
    private double prezzo;

    public Menu(double prezzo) {
        this.prezzo = prezzo;
    }

    public  Menu(){

    }
}
