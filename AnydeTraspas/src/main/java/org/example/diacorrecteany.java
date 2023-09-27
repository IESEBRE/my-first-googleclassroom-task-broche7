package org.example;

import java.util.Scanner;

public class diacorrecteany {

    public static void main(String[] args) {

        Scanner dia = new Scanner(System.in);
        int resposta = dia.nextInt();

        if (resposta >=1 && resposta<365){
            System.out.println("Correcte per un any no bixest");
        }
        else if (resposta == 366){
            System.out.println("Correcte per un any bixest!");}
        else {
            System.out.println("Incorrecte!" );
        }
    }
}
