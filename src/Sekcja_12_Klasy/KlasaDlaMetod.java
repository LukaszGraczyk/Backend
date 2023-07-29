package Sekcja_12_Klasy;

public class KlasaDlaMetod
{
    // typZwracany nazwaMetody(parametry) {}

    void metodaKtoraNicNieZwraca()
    {
        System.out.println("Wartość wypisana z metody");
    }

    void metodaKtorePrzyjmujeArgument(int liczba, char znak) // liczba i znak to prametry
    {
        System.out.println("Wartość z metody: " + liczba + znak);
    }
}
