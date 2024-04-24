
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi un intero");
        int n= scanner.nextInt();

        ArrayList<Integer> lista = creaListaOrdinata(n);
        System.out.println(lista);

        ArrayList<Integer> listaModificata =creaListaModificata(lista);
        System.out.println(listaModificata);

        stampaElementi(false, lista);
    }

    public static ArrayList<Integer> creaListaOrdinata(int n){
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=0; i<n; i++){
            lista.add(new Random().nextInt(0,101));
        }

        Collections.sort(lista);

        return lista;
    }

    public static ArrayList<Integer> creaListaModificata(ArrayList<Integer> lista){
        ArrayList<Integer> listaModificata = new ArrayList<>();

        listaModificata.addAll(lista);

        ArrayList<Integer> listaClone = new ArrayList<>();
        listaClone.addAll(lista);

        Collections.reverse(listaClone);

        listaModificata.addAll(listaClone);

        return listaModificata;
    }

    public static void stampaElementi(boolean b, ArrayList<Integer> lista){
        if(b){
            for(int i=0; i<lista.size(); i=i+2){
                System.out.println(lista.get(i));
            }
        }
        else{
            for(int i=1; i<lista.size(); i=i+2){
                System.out.println(lista.get(i));
            }
        }
    }
}