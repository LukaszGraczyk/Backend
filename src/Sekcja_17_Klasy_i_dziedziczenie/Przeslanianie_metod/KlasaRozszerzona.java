package Sekcja_17_Klasy_i_dziedziczenie.Przeslanianie_metod;

public class KlasaRozszerzona extends KlasaPodstawowa
{
    @Override       // Przesłonienie metody konieczne ze względu na dziedziczenie metody o takiej samej nazwie z klasy podstawowej
    void metoda()
    {
        System.out.println("Wypisałem z klasy rozszerzonej");
    }
}

// Jeżeli wywołalibyśmy obiekt z klasy rozszerzonej z metodą o takiej samej nazwie jak metoda z klasy podstawowej
// ale bez przesłonięcia @Override to zadziałałaby metoda z klasy podstawowej