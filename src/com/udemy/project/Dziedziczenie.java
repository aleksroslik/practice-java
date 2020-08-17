package com.udemy.project;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;

public class Dziedziczenie {
    public static void  main(String[] args)
    {
        Potwor p = new Potwor(10, 100);
        System.out.println(p.predkoscChodzenia);
        Szkielet s = new Szkielet(25, 50, "Miecz");
        s.atakuj();
        System.out.println(s.predkoscChodzenia);
        Zombie z = new Zombie(5,30, "Wirus");
        System.out.println(z.typBroni);
    }
}
