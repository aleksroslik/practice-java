package com.udemy.project;

public class Referencje
{
    public static void main(String[] args)
    {
        int a = 53;
        int b = a;
        b = 30;

        Test x = new Test(); // pod x nie znajduje sie zadna wartosc zwykla, typowa, prymitywna, tylko adres - zmienna referencyjna
        a = x.zmienWartosc(a);
        System.out.println(a);

        Test2 test2 = new Test2();
        x.zmienWartosc(test2);
        System.out.println(test2.y);

        /* Test y = x;
        y.a = 40;
        System.out.println(x.a);

        String imie = "Ola";
        String imie2 = imie;

        imie2 = "Zonk";
        System.out.println(imie); */
    }
}

class Test
{
    int zmienWartosc(int zm)
    {
        zm = zm +2;
        return zm;
    }
    void zmienWartosc(Test2 zm)
    {
        zm.y = zm.y +40;
    }
}

class Test2
{
    int y = 20;
}