package org.example;

import java.util.Scanner;

public class diescorrectes2 {
    public static void main(String[] args) {
        Scanner dia = new Scanner(System.in);
        int resultat = dia.nextInt();

        if (resultat >=1 && resultat <=365) System.out.println("Correcte!");

        else if (resultat == 366)
            System.out.println("Correcte!");

        else System.out.println("Incorrecte!");
    }
}
