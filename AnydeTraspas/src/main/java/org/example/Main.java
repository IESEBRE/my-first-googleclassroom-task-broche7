package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        int any = numero1.nextInt();

        if( (any % 4 == 0 && any % 100 != 0) || any % 400 ==0){
        System.out.println("SI");}
        else System.out.println("NO");

    }
}