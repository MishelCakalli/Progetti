package Esercizio3;

public class Esercizio3 {
    public static void main(String[] args) {
        perimetroRettangolo(4, 2);
        pariDispari(2);
        perimetroTrinagolo(11,30,25);

    }

    public static void perimetroRettangolo(int l1, int l2) {
        int perimetro = l1 + l1 + l2 + l2;
        System.out.println(perimetro);
    }

    public static void pariDispari(int a) {
        if (a % 2 == 0) {
            System.out.println("Il numero è pari.");
        } else {
            System.out.println("Il numero è dispari.");
        }
    }
    public static void perimetroTrinagolo(int x,int y,int z){
        double p = (x + y + z) / 2.0;
        double area = Math.sqrt(p * (p - x) * (p - y) * (p - z));
        System.out.println("L'area del triangolo è: " + area);


    }
}