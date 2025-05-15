public class Gad extends Zwierze
{
    @Override
    public String wydajDzwiek() {
        return "sssssssssssssssssss";
    }

    @Override
    public String poruszajSie() {
        return "tup tup tup tup tup tup tup";
    }

    public Gad( String nazwa, int wiek, boolean czyJestDlugi)
    {
        super(nazwa, wiek);
    }

    public void zniesGadzieJajo()
    {
        System.out.println("Zniosssssslem jajo szefie");
    }
}
