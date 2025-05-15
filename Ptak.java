public class Ptak extends Zwierze
{
    @Override
    public String wydajDzwiek() {
        return "krrrrrrrrrrraaaaaaa";
    }

    @Override
    public String poruszajSie() {
        return "pfffpffffpfpfppff";
    }
    public Ptak( String nazwa, int wiek, boolean czyMaPiora)
    {
        super(nazwa, wiek);
    }

    public void zniesJajo()
    {
        System.out.println("Ptak zniosl giga jajo");
    }
}
