package Sekcja_28_Enum_typ_wyliczeniowy.Enum_konstruktor;

public enum Pizza
{
    // W klasie Enum tworzymy tzw. elementy będące Static Final

    MALA(20), // Możemy pizzom nadać cechy takie jak rozmiar w cm
    DUZA(34),
    FAMILIJNA(42),
    XXL(50); // Po ostatnim enumie dajemy średnik

    public int rozmiar;

    private Pizza (int rozmiar)
    {
        this.rozmiar = rozmiar;
    }
}
