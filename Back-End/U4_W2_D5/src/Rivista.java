public class Rivista implements ElementoBiblioteca {

    private String isbn;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;
    private Periodicita periodicita;


    public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
        this.periodicita = periodicita;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String getTitolo() {
        return titolo;
    }

    @Override
    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    @Override
    public int getNumeroPagine() {
        return numeroPagine;
    }
}