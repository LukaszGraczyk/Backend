package Sekcja_23_Watki.interrupt;

public class MainInterrupt
{
    public static void main(String[] args)
    {
        Thread watek1 = new Thread(new KlasaInterrupt());
        watek1.start();

        watek1.interrupt(); // Przerwanie wątku
    }
}
