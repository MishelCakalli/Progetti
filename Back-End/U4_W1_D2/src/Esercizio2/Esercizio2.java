package Esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero tra 0 e 3");
        int numero = scanner.nextInt();

        switch (numero) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;

            default:
                System.out.println("Scelta errata, scegli un numero tra 0 e 3");
        }
    }
}
