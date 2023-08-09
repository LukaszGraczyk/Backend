package Sekcja_16_Klasy_zadania.Zadanie_2;

public class Zadanie_2_main
{
    public static void main(String[] args)
    {
        int[] malaTablica = {1,2,3,4};

        Obliczenia obliczenia = new Obliczenia(malaTablica);
        System.out.println("Suma to: " + obliczenia.suma());
        System.out.println("Średnia to: " + obliczenia.srednia2());
    }
}
