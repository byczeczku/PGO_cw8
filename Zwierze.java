public abstract class Zwierze
{
    //zmienne
    protected String nazwa;
    protected int wiek;

    //konstruktor
    public Zwierze()
    {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    //gettery
    public int getWiek() {
        return wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    //metody abstrakcyjne
    public abstract String wydajDzwiek();
    public abstract String poruszajSie();

    //metoda info
    public void wyswietlInformacje(String nazwa, int wiek)
    {
        System.out.println("INFORMACJE O ZWIERZU:");
        System.out.println("============");
        System.out.println("Naswa: " + nazwa);
        System.out.println("Wiek: " + wiek);
    }
}

