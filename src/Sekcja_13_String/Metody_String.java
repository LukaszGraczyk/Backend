package Sekcja_13_String;

public class Metody_String
{
    public static void main(String[] args)
    {
        String tekst = "Jakiś tekst";
        System.out.println("Length: " + tekst.length());
        System.out.println("isEmpty: " + tekst.isEmpty());

        char pojedynczyZnak = tekst.charAt(6);
        System.out.println("charAt: " + pojedynczyZnak);
    }
}
