package Esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();
        System.out.println("Conto alla rovescia:");

        try {
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
