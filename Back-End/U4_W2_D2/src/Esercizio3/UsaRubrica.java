package Esercizio3;

public class UsaRubrica {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();

        rubrica.inserisciContatto("Carla Russo", "123456");
        rubrica.inserisciContatto("Franca Galli", "35156");
        rubrica.inserisciContatto("Mario Rossi", "89789");

        rubrica.stampaRubrica();

        System.out.println(rubrica.cercaPerNome("Mario Rossi"));
        System.out.println(rubrica.cercaPerTelefono("123456"));

        rubrica.rimuoviContatto("Mario Rossi");

        rubrica.stampaRubrica();
    }
}