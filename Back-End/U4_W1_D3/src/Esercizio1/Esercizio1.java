package Esercizio1;

public class Esercizio1 {
    public static void main(String[] args) {
        stampaRettangolo();
        stampaDueRettangoli();

    }

    public static void stampaRettangolo() {
        Rettangolo rettangolo = new Rettangolo(4, 6);
        System.out.println("L'area e': " + rettangolo.getArea() + "\nIl perimetro e': " + rettangolo.getPerimetro() + "\n");

    }

    public static void stampaDueRettangoli() {
        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        System.out.println("L'area 1 e': " + rettangolo1.getArea() + "\nIl perimetro 1 e': " + rettangolo1.getPerimetro() + "\n");
        Rettangolo rettangolo2 = new Rettangolo(10, 20);
        System.out.println("L'area 2 e': " + rettangolo2.getArea() + "\nIl perimetro 2 e': " + rettangolo2.getPerimetro() + "\n");
        System.out.println("La somma Perimetro:" + rettangolo1.getPerimetro() + rettangolo2.getPerimetro() + "\n");
        System.out.println("La somma Area:" + rettangolo1.getArea() + rettangolo2.getArea() + "\n");
    }
}
