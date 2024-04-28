import java.util.List;

public class CatalogoManager {

    private Catalogo catalogo;

    public CatalogoManager(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void aggiungiElemento(ElementoBiblioteca elemento) {
        catalogo.aggiungiElemento(elemento);
    }


    public void rimuoviElemento(String isbn) {
        catalogo.rimuoviElemento(isbn);
    }


    public List<ElementoBiblioteca> ricercaPerIsbn(String isbn) {
        return catalogo.ricercaPerIsbn(isbn);
    }

    public List<ElementoBiblioteca> ricercaPerAnnoPubblicazione(int anno) {
        return catalogo.ricercaPerAnnoPubblicazione(anno);
    }

    public List<ElementoBiblioteca> ricercaPerAutore(String autore) {
        return catalogo.ricercaPerAutore(autore);
    }

    public void salvaSuDisco() {
        catalogo.salvaSuDisco("catalogo.dat");
    }

    public void caricaDaDisco() {
        catalogo.caricaDaDisco("catalogo.dat");
    }
}
