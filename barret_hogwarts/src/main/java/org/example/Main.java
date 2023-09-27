package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String nom = ent.next();
        if(nom.equals("Coratge")) {
            System.out.println("Gryffindor");
        } else if(nom.equals("Coneixement")) {
            System.out.println("Ravenclaw");
        } else if(nom.equals("Ambicio")) {
            System.out.println("Slytherin");
        } else {
            System.out.println("Hufflepuff");
        }
    }
}