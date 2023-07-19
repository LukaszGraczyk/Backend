package Sekcja_3_Zmienne;

public class Typy_proste_konwertowanie
{
    public static void main(String[] args)
    {
        int i = 6;
        double d = 2.2;
        System.out.println(i / d); // Konwertowanie wartości na double


        // Konwertowanie niejawne

        double d2 = i;  // Możliwa jest konwersja "rozszerzająca" czyli:
                        // int -> double
                        // float -> double
                        // byte -> long
                        // itd
                        // Niemożliwa jest konwersja odwrotna do rozszerzającej czyli:
                        // double -> int
                        // double -> float
                        // long -> byte
                        // itd
                        // Konwersja odbywa się automatycznie (konwertowanie niejawne)
                        // Konwertowanie niejawne umożliwia jedynie konwersję "rozszerzającą"!


        // Konwertowanie jawne (rzutowanie)

        long zmiennaLong = 123;
        int zmiennaInt = (int) zmiennaLong; // Konwersja odwrotna do "rozszerzającej" jawna




        



    }
}
