package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Dichiaro la variabile "nome"
        String nome;
        int eta;

        //Inizializzo la struttura per leggere da tastiera
        Scanner in = new Scanner(System.in);

        System.out.println("Ciao, come ti chiami?");
        //Leggo da tastiera una variabile stringa
        nome = in.next();

        System.out.println("Ciao "+nome);   //Visualizzazione in Output

        System.out.println("Quanti anni hai?");
        eta = in.nextInt();

        if (eta > 50) {
            System.out.println("Ammappete quanto sei vecchio!");
            System.out.println(nome+" hai "+eta+" anni");
        }
        else {
            System.out.println("Hai solo "+eta+" anni");
        }
    }
}
