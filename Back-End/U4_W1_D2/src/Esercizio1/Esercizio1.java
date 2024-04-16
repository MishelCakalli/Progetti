package Esercizio1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String test = scanner.next();
        stringaPariDispari(test);

        System.out.println("Inserisci un anno");
        int test2 = scanner.nextInt();
        stringaBisestile(test2);

    }

    public static Boolean stringaPariDispari(String s) {

        if (s.length() % 2 == 0) {
            System.out.println("La stringa e' pari");
            return true;
        } else {
            System.out.println("La stringa e' dispari");
            return false;
        }
    }

    public static Boolean stringaBisestile(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0) {
            System.out.println("L'anno è bisestile");
            return true;
        } else {
            System.out.println("L'anno non è bisestile");
            return false;
        }
    }

}
