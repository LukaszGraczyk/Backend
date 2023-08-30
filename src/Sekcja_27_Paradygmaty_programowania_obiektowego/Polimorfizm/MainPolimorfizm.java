package Sekcja_27_Paradygmaty_programowania_obiektowego.Polimorfizm;

public class MainPolimorfizm
{
    public static void main(String[] args)
    {
        // Polimorfizm

        Zwierze zwierze = new Kon();
        zwierze.wydajDzwiek();

        zwierze = new Pies();
        zwierze.wydajDzwiek();
    }
}
