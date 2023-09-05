package Sekcja_29_IO_File_zapisywanie_wczytywanie_pliku.Zapisywanie_do_pliku;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainPlikiZapisywanie
{
    public static void main(String[] args)
    {
        try {
            String path = "moj_plik.txt";
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        }
        catch (IOException e)
        {
            System.out.println("Błąd operacji z plikiem");
        }

    }
}
