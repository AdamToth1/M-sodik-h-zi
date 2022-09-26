package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner be=new Scanner(System.in);

        System.out.println("Add meg a neved!");
        String nev=be.nextLine();
        System.out.println("nemet, angol vagy olasz legyen a nyelv?");
        String nyelv=be.nextLine();

        if(nyelv.equals("nemet")) {
            System.out.println("Guten Tag," + nev + "!");
            if (nyelv.equals("olasz"))
                System.out.println("Ciao " + nev + "!");
            if (nyelv.equals("angol"))
                System.out.println("Hi " + nev + "!");
        } else
            System.out.println("Szia " + nev + "!");
    }
}