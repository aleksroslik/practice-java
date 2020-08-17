package dziedziczenie.potwory;

public class Potwor {
    public double predkoscChodzenia = 10;
    public double poziomZycia;

    public void atakuj()
    {
        //domyslna implementacja ataku
        System.out.println("To jest metoda atakuj z klasy potwor");
    }

    public Potwor()
    {
        System.out.println("Domyslny konstruktor z klasy Potwor");
    }
    public Potwor(double predkoscChodzenia, double poziomZycia)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.poziomZycia = poziomZycia;
        System.out.println("NieDomyslny konstruktor z klasy potwor");
    }
}
