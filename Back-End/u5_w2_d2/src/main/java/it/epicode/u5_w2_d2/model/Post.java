package it.epicode.u5_w2_d2.model;

import lombok.Data;

@Data
public class Post {
    private int id;
    private static int cont;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

    public Post(String categoria, String contenuto, int tempoDiLettura, String titolo) {
        this.categoria = categoria;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
        this.titolo = titolo;
        cont++;
        id=cont;
        this.cover = "https://picsum.photos/200/300";
    }
}
