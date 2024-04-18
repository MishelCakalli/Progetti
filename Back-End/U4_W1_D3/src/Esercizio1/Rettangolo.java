package Esercizio1;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;

    }

    public int getArea() {
        return altezza*larghezza;
    }
    public int getPerimetro(){
        return altezza+altezza+larghezza+larghezza;
    }

}
