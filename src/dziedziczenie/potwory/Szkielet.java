package dziedziczenie.potwory;

public class Szkielet extends Potwor
{
    @Override
    public void atakuj()
    {
        super.atakuj();
        //domyslna implementacja ataku
        System.out.println("To jest metoda atakuj z klasy szkielet");
    }
    String typBroni;
    public Szkielet()
    {
        System.out.println("Domyslny konstruktor z klasy szkielet");
    }
    public Szkielet(double predkoscChodzenia, double poziomZycia, String typBroni)
    {
        super(predkoscChodzenia, poziomZycia); //konstruktor zklasy wyzszej
        this.typBroni = typBroni;
        System.out.println("Niedomyslny konstruktor klasy szkielet");

    }
}
