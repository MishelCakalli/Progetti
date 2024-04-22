import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometri;
        int litri;

        do {
            System.out.println("Inscerisci i kilometri fatti");
            kilometri = scanner.nextInt();
            System.out.println("Inscerisci i litri consumati");
            litri = scanner.nextInt();
            try {
                int consumo = kilometri / litri;

                System.out.println("Hai fatto " + consumo + " KM/L");
            } catch (Exception error) {
                System.out.println("E' impossibile perche i litri = " + error.getMessage());
            }


        } while (litri != 0);
        scanner.close();
    }
}

