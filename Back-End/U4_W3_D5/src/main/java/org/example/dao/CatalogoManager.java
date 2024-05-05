package org.example.dao;
import org.example.entity.ElementoCatalogo;
import org.example.entity.Prestito;

import java.util.List;

public interface CatalogoManager {
    void aggiungiElemento(ElementoCatalogo elemento);
    void rimuoviElementoPerISBN(String codiceISBN);
    ElementoCatalogo cercaPerISBN(String codiceISBN);
    List<ElementoCatalogo> cercaPerAnnoPubblicazione(int anno);
    List<ElementoCatalogo> cercaPerAutore(String autore);
    List<ElementoCatalogo> cercaPerTitolo(String titolo);
    List<ElementoCatalogo> cercaElementiInPrestitoPerUtente(String numeroTessera);
    List<Prestito> ricercaPrestitiScadutiERestituiti();
}
