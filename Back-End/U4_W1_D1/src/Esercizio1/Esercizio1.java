package Esercizio1;

public class Esercizio1 {
    public static void main(String[] args) {

        System.out.println("La moltiplicazione e': "+moltiplica(2,4));
        System.out.println("La concatenzaione e': "+Concatena("Mi chiamo Mishel e ho ", 21)+" anni");
        InscerisciInArray();

    }
    public static int moltiplica(int x,int y){
        return y * x;
    }
    public static String Concatena(String s, int a){
        return s+a;
    }
    public static void InscerisciInArray(){

        String[] Array1 = new String[5];
        String[] ArrayNuovo=new String[6];

        Array1[0] = "1";
        Array1[1] = "2";
        Array1[2] = "3";
        Array1[3] = "4";
        Array1[4] = "5";

        System.out.println("Array iniziale e' lungo "+Array1.length);
        Array1=ArrayNuovo;
        System.out.println("Array finale e' lungo "+Array1.length);

    }
}
