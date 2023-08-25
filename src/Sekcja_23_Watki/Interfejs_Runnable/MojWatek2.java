package Sekcja_23_Watki.Interfejs_Runnable;

public class MojWatek2 implements Runnable
{
    @Override
    public void run()
    {
        for(int i = 1001 ; i <= 2000 ; i++)
        {
            System.out.println("Drugi wątek: " + i);
        }
    }
}
