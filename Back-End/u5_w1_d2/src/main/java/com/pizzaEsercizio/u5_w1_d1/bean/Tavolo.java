package com.pizzaEsercizio.u5_w1_d1.bean;

import lombok.Data;

@Data
public class Tavolo {
    private int number;
    private int maxSeats;
    private boolean occupied;

    public Tavolo(int maxSeats, int number, boolean occupied) {
        this.maxSeats = maxSeats;
        this.number = number;
        this.occupied = occupied;
    }
    public Tavolo() {

    }
}
