package com.pizzaEsercizio.u5_w1_d1.bean;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Ordine {
    private int orderNumber;
    private String status;
    private int seats;
    private LocalDateTime acquisitionTime;
    private double totalAmount;
}
