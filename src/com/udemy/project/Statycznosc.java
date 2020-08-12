package com.udemy.project; //tematycznie powiazane ze soba klasy - pakunek

public class Statycznosc {

    public static void main(String[] args)
    {
        Klient a = new Klient("Arkadiusz");
        Klient b = new Klient("Ola");
        Klient c = new Klient("Tomasz");

        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);

        System.out.println(Klient.nastepnyId);
    }
}

class Klient
{
    Klient(String imie) //konstruktor
    {
        this.imie = imie;
        id = nastepnyId;
        nastepnyId++;
    }

    String imie;
    int id = 0;
    static int nastepnyId = 1;

}