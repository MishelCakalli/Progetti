package Esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci una stringa (inserisci 'q' per terminare): ");
            String stringaInserita = scanner.nextLine();

            if (stringaInserita.equals("q")) {
                System.out.println("Hai inserito 'q'. Uscita dal programma.");
                break;
            }
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < stringaInserita.length(); i++) {
                if (i > 0) {
                    output.append(", ");
                }
                output.append(stringaInserita.charAt(i));
            }
            System.out.println("Caratteri separati da virgola: " + output.toString());
        }
    }
}
