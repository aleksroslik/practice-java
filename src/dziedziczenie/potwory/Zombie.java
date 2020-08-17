package dziedziczenie.potwory;

public class Zombie extends Potwor
{
    public String typBroni;
    public Zombie()
    {
        System.out.println("Domyslny konstruktor z klasy Zombie");
    }
    public Zombie(double predkoscChodzenia, double poziomZycia, String typBroni)
    {
        super(predkoscChodzenia, poziomZycia);
        this.typBroni = typBroni;
        System.out.println("Niedomyslny konstruktor klasy Zombie");

    }
}
