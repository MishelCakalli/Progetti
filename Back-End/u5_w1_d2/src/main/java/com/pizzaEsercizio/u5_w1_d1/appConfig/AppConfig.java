package com.pizzaEsercizio.u5_w1_d1.appConfig;

import com.pizzaEsercizio.u5_w1_d1.bean.Bevande;
import com.pizzaEsercizio.u5_w1_d1.bean.Pizza;
import com.pizzaEsercizio.u5_w1_d1.bean.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Pizza getPizza(){
        Pizza pizza = new Pizza();
        pizza.setBaseMargherita("Margherita");
        pizza.setPrezzo(7);
        return pizza;
    }
    @Bean
    public Bevande getBevande(){
        Bevande bevande = new Bevande();
        bevande.setAlcolici("Vino");
        bevande.setPrezzo(12);
        bevande.setBibiteGassate("Coca Cola");
        bevande.setPrezzo(2);
        bevande.setAnalcolici("acqua");
        bevande.setPrezzo(1);
        return bevande;
    }

    @Bean
    public Toppings getToppings(){
        Toppings toppings = new Toppings();
        toppings.setCarne("Prosciutto");
        toppings.setPrezzo(2);
        toppings.setFormaggio("Gorgonzola");
        toppings.setPrezzo(2);
        toppings.setPatate("Patate Fritte");
        toppings.setPrezzo(1);
        toppings.setVerdure("Funghi");
        toppings.setPrezzo(3);
        toppings.setPesce("Merluzzo");
        toppings.setPrezzo(4);
        return toppings;
    }



}
