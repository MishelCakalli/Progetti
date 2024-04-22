import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> numeri = new ArrayList<>();

        int x;
        do {
            numeri.clear();

            for (int i = 0; i < 5; i++) {
                int numeroCasuale = random.nextInt(10) + 1;
                numeri.add(numeroCasuale);
            }

            System.out.println("Numeri casuali generati:");
            for (int numero : numeri) {
                System.out.println(numero);
            }

            try {
                System.out.println("Inserisci un numero (0 per uscire):");
                x = scanner.nextInt();

                if (x != 0) {
                    System.out.println("Scegli l'indice:");
                    int indice = scanner.nextInt();

                    if (indice >= 0 && indice <= numeri.size()) {
                        numeri.add(indice, x);
                        System.out.println(numeri);
                    } else {
                        System.out.println("Indice non valido");
                    }
                }
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
                scanner.nextLine();
                x = -1;
            }
        } while (x != 0);

        scanner.close();
    }
}
