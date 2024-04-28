import java.util.List;

public class App {

    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Libro libro1 = new Libro("ISBN12345", "Titolo Libro 1", 2020, 300, "Autore 1", "Genere 1");
        Libro libro2 = new Libro("ISBN67890", "Titolo Libro 2", 2021, 450, "Autore 2", "Genere 2");
        Rivista rivista1 = new Rivista("ISBN34567", "Titolo Rivista 1", 2022, 100, Periodicita.MENSILE);

        catalogo.aggiungiElemento(libro1);
        catalogo.aggiungiElemento(libro2);
        catalogo.aggiungiElemento(rivista1);

        String isbnDaRimuovere = "ISBN12345";
        System.out.println("Rimozione dell'elemento con ISBN " + isbnDaRimuovere);
        catalogo.rimuoviElemento(isbnDaRimuovere);

        // Ricerca  ISBN
        String isbnDaCercare = "ISBN67890";
        List<ElementoBiblioteca> risultatoRicercaISBN = catalogo.ricercaPerIsbn(isbnDaCercare);
        if (!risultatoRicercaISBN.isEmpty()) {
            System.out.println("Elemento trovato per ISBN " + isbnDaCercare + ": " + risultatoRicercaISBN.get(0));
        } else {
            System.out.println("Nessun elemento trovato per ISBN " + isbnDaCercare);
        }

        // Ricerca  anno
        int annoPubblicazioneDaCercare = 2022;
        List<ElementoBiblioteca> risultatoRicercaAnno = catalogo.ricercaPerAnnoPubblicazione(annoPubblicazioneDaCercare);
        System.out.println("Elementi pubblicati nell'anno " + annoPubblicazioneDaCercare + ": " + risultatoRicercaAnno);

        // Ricerca  autore
        String autoreDaCercare = "Autore 2";
        List<ElementoBiblioteca> risultatoRicercaAutore = catalogo.ricercaPerAutore(autoreDaCercare);
        System.out.println("Elementi dell'autore " + autoreDaCercare + ": " + risultatoRicercaAutore);

    }
}
