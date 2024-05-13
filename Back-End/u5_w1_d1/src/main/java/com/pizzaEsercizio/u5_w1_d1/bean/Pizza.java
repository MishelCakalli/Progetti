package com.pizzaEsercizio.u5_w1_d1.bean;


import lombok.Data;

@Data
public class Pizza extends Menu {
    private String baseMargherita;

    public Pizza(String baseMargherita) {
        this.baseMargherita = baseMargherita;
    }

    public Pizza(double prezzo, String baseMargherita) {
        super(prezzo);
        this.baseMargherita = baseMargherita;
    }
    public  Pizza(){

    }
}
