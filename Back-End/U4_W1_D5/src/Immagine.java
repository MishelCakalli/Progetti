class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo, 0); // Immagine non ha durata
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }

    public void show() {
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println(" " + titolo);
    }
}