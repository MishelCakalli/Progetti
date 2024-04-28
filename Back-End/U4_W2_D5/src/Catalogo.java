import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Catalogo {

    private List<ElementoBiblioteca> elementi;

    public Catalogo() {
        this.elementi = new ArrayList<>();
    }

    public void aggiungiElemento(ElementoBiblioteca elemento) {
        elementi.add(elemento);
    }

    public void rimuoviElemento(String isbn) {
        elementi.removeIf(e -> e.getIsbn().equals(isbn));
    }

    public List<ElementoBiblioteca> ricercaPerIsbn(String isbn) {
        return elementi.stream()
                .filter(e -> e.getIsbn().equals(isbn))
                .toList();
    }

    public List<ElementoBiblioteca> ricercaPerAnnoPubblicazione(int anno) {
        return elementi.stream()
                .filter(e -> e.getAnnoPubblicazione() == anno)
                .toList();
    }

    public List<ElementoBiblioteca> ricercaPerAutore(String autore) {
        return elementi.stream()
                .filter(e -> e instanceof Libro && ((Libro) e).getAutore().equals(autore))
                .toList();
    }

    public void salvaSuDisco(String s) {
    }

    public void caricaDaDisco(String s) {
    }

    public Collection<Object> getElementi() {
        return Collections.singleton(elementi);
    }
}
