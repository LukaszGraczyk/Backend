package Sekcja_23_Watki.interrupt;

public class KlasaInterrupt2 implements Runnable
{
    @Override
    public void run()
    {
        while(!Thread.interrupted()) // Wątek ma działać aż nie zostanie przerwany
        {
            System.out.println("Wątek działa");
        }
        System.out.println("Koniec działąnia wątku");
    }
}
