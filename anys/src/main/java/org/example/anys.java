package org.example;

import java.util.Scanner;

public class anys {
        public static void main(String[] args) {
            Scanner ent = new Scanner(System.in);
            System.out.println("How old are you?");
            int valor = 0;
            valor = ent.nextInt();
            System.out.println("You have " + valor + " years old");
        }
    }