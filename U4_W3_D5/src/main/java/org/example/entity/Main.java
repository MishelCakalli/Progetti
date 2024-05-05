package org.example.entity;

import org.example.dao.CatalogoManager;
import org.example.dao.CatalogoManagerDao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalogoManager catalogoManager = new CatalogoManagerDao();

        // Creazione di libro
        Libro libro = new Libro();
        libro.setCodiceISBN("978-8808182152");
        libro.setTitolo("Il Signore degli Anelli");
        libro.setAnnoPubblicazione(1954);
        libro.setNumeroPagine(1170);
        libro.setAutore("J.R.R. Tolkien");
        libro.setGenere("Fantasy");
        catalogoManager.aggiungiElemento(libro);

        // Creazione di rivista
        Rivista rivista = new Rivista();
        rivista.setCodiceISBN("978-8854185253");
        rivista.setTitolo("National Geographic");
        rivista.setAnnoPubblicazione(2022);
        rivista.setNumeroPagine(100);
        rivista.setPeriodicita(Rivista.Periodicita.MENSILE);
        catalogoManager.aggiungiElemento(rivista);

        // Ricerca per ISBN
        ElementoCatalogo elementoCercato = catalogoManager.cercaPerISBN("978-8808182152");
        if (elementoCercato != null) {
            System.out.println("Elemento trovato per ISBN: " + elementoCercato.getTitolo());
        } else {
            System.out.println("Nessun elemento trovato per l'ISBN specificato.");
        }

        // Ricerca anno di pubblicazione
        List<ElementoCatalogo> elementiPerAnno = catalogoManager.cercaPerAnnoPubblicazione(2022);
        System.out.println("Elementi pubblicati nel 2022:");
        for (ElementoCatalogo elemento : elementiPerAnno) {
            System.out.println("- " + elemento.getTitolo());
        }

        // Rimozione di ISBN
        catalogoManager.rimuoviElementoPerISBN("978-8854185253");

        // Verifica
        elementoCercato = catalogoManager.cercaPerISBN("978-8854185253");
        if (elementoCercato != null) {
            System.out.println("Elemento trovato per ISBN dopo la rimozione: " + elementoCercato.getTitolo());
        } else {
            System.out.println("Elemento non trovato dopo la rimozione.");
        }
    }
}
