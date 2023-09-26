package org.example;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner comparation = new Scanner(System.in);
        System.out.println("Introdueix el primer nombre");
        int num1 = comparation.nextInt();
        System.out.println("Introdueix el segon nombre");
        int num2 = comparation.nextInt();

        if (num1 > num2){
        System.out.println("Num1 es mes gran que el num2");
    }
        if (num1 < num2){
            System.out.println("Num2 es mes gran que num1");
        }

        if (num1 == num2){
            System.out.println("Els numeros son iguals!");
        }
}
}