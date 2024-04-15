package Esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inscerisci la prima Stringa: " );
        String x = scanner.next();

        System.out.println("Inscerisci la seconda Stringa: ");
        String y = scanner.next();

        System.out.println("Inscerisci la terza Stringa: ");
        String z = scanner.next();

        System.out.println(x+" " +y+" "+ z);

        System.out.println(z+" " +y+" "+ x);
    }

}
