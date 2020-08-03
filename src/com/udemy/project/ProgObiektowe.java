package com.udemy.project;

public class ProgObiektowe {

    public static void main(String[] args)
    {
        // Obiekty - pojemniki na zmienne i funkcje tematyczne, powiązane ze sobą
        // Klasy - szablony do tworzenia obiektów - z duzej litery
        // Properties - właściwosci
        // Parametry - zmienne okreslajace konstruktor
        // Metody - funkcje (void) - z malej litery


        Monitor abc = new Monitor();
        abc.szerokosc = 1200;
        Monitor abc2 = new Monitor();
        abc2.szerokosc = 800;
        abc2.wysokosc = 800;


        Punkt p = new Punkt(10, 15); // konstruktor, okreslajacy obiekt
       // p.x = 5;
       // p.y = 20;

        System.out.println( "p.x" + p.x);
        System.out.println("p.y" + p.y);
    }
}

class Monitor
{
    int szerokosc;
    int wysokosc;

}

class Punkt
{
    Punkt()
    {
        System.out.println("Wywołano konsktuktor domyslny");
        x = 20;
        y = 20;
    }
    Punkt(int pierwszy, int drugi)
    {
        System.out.println("Wywołano konstruktor z dwoma parametrami");
        x = pierwszy;
        y = drugi;
    }
    int x;
    int y;
}
