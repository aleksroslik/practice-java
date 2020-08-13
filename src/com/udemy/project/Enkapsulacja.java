package com.udemy.project;

public class Enkapsulacja
{
    public static void main(String[] args)
    {
        KontoBankowe oszczednosciowe = new KontoBankowe();

        oszczednosciowe.setSaldo(10000);

        if (oszczednosciowe.wyplata(10001))
        {
            System.out.println("wypłacono");
        }
        else
            System.out.println("za mało środków");

        oszczednosciowe.wplata(5000);

        System.out.println(oszczednosciowe.getSaldo());
    }
}

class KontoBankowe
{
    public KontoBankowe()
    {
        saldo = 1000;
    }
    private int saldo;

    int getSaldo() // pobieranie wartosci i "pokazywanie" mimo, ze jest ustawione na prywatne
    {
        return saldo;
    }

   void setSaldo(int saldo)
    {
        // ustawic warunki! boolean!

        this.saldo = saldo;
        //boolean >>>> return true;
    }

    boolean wyplata(int ile)
    {
        if (saldo < ile)
            return false;
        else
            setSaldo (saldo - ile);
        return true;
    }

    boolean wplata(int ile)
    {
        setSaldo(saldo + ile);
        return true;
    }
}
