import java.util.Scanner;
public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] playlist = new ElementoMultimediale[5];

        // Inizializzazione degli elementi multimediali
        playlist[0] = new RegistrazioneAudio("Audio 1", 2, 2);
        playlist[1] = new Video("Video 1", 4, 3, 4);
        playlist[2] = new Immagine("Immagine 1", 5);

        // Lettura di input per la riproduzione degli elementi multimediali
        int choice;
        do {
            System.out.println("Seleziona un elemento da riprodurre (1-5, 0 per uscire):");
            for (int i = 0; i < playlist.length; i++) {
                if (playlist[i] != null) {
                    System.out.println((i + 1) + ". " + playlist[i].titolo);
                }
            }
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= 5 && playlist[choice - 1] != null) {
                if (playlist[choice - 1] instanceof Riproducibile) {
                    ((Riproducibile) playlist[choice - 1]).play();
                } else {
                    playlist[choice - 1].show();
                }
            } else if (choice != 0) {
                System.out.println("Scelta non valida.");
            }
        } while (choice != 0);
    }
}