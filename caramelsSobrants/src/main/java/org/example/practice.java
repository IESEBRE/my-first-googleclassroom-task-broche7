package org.example;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner comparation = new Scanner(System.in);
        int num1 = comparation.nextInt();
        int num2 = comparation.nextInt();

        if (num1 == num2){
            System.out.println("Els numeros son iguals");
        }
        if (num1 != num2){
            System.out.println("Els numeros no son iguals");
        }
    }
}
