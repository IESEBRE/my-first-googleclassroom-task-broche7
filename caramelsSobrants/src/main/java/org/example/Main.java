package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);

        int caramels, nens;

        caramels = ent.nextInt();
        nens = ent.nextInt();

        System.out.println(caramels % nens);

    }
}