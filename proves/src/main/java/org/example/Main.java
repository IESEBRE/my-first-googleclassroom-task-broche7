package org.example;

public class Main {
    public static void main(String[] args) {
        int brian = 10;
        int ryde = 20;
        double cod = 8.96;
        double fortnite = 14.8;
        System.out.println( brian + ryde);
        System.out.println( brian - ryde);
        System.out.println( brian / ryde);
        System.out.println( brian % ryde);

        System.out.println(brian + cod);
        System.out.println(ryde % fortnite);

        ryde = ryde +1;
        System.out.println(ryde + brian);

        ryde *= 45;
        System.out.println(ryde + brian);
    }
}