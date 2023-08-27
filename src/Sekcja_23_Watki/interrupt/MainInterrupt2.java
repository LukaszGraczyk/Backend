package Sekcja_23_Watki.interrupt;

public class MainInterrupt2
{
    public static void main(String[] args)
    {
        Thread watek2 = new Thread(new KlasaInterrupt2());
        watek2.start();

        try {Thread.sleep(2000);} catch (InterruptedException e) {} // Wątek uśpiony na 2 sekundy

        watek2.interrupt(); // Przerwanie wątku po 2 sekundach
    }
}
