package com.udemy.project;

public class Metody
{
    public static void main(String[] args) {
        Test a = new Test();
        a.wypisz("Ola", "Roslik");

        int wynik = a.dodaj(10, 20);
        System.out.println(wynik);

        double wynik2 = a.result(20, 0);
        System.out.println(wynik2);
    }

    static class Test
    {
        void wypisz(String imie, String nazwisko)
        {
            System.out.println("Imię:" + " " + imie);
            System.out.println("Nazwisko:" + " " + nazwisko);
            System.out.println();
        }

        int dodaj (int a, int b)
        {
            return a + b;
        }

        double result (double a, double b)
        {
            if (b == 0)
                return 0;

            System.out.println("test");

            return a / b;
        }
    }
}