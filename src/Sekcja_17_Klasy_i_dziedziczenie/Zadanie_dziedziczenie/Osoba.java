package Sekcja_17_Klasy_i_dziedziczenie.Zadanie_dziedziczenie;

public class Osoba
{
    protected String imie;
    protected String nazwisko;

    public Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie()
    {
        System.out.println("Jestem " + imie + " " + nazwisko);
    }
}
