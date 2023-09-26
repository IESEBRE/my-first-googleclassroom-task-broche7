package org.example;

public class equales {
    public static void main(String[] args) {

        String name = "Roche";
        int age = 18;
        System.out.println(name.equals("Roche") || !(age > 17));

        System.out.println(name.equals("Roche") && !(age > 17));

        System.out.println(name.equals("Roche") || name.equals("Roche") && age >= 17 && age <= 16);
    }


}
