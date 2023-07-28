package Sekcja_11_Petle_zadania;

public class Zadanie_7
{
    public static void main(String[] args)
    {
        /*
        Zadanie 7: Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) trójkąt prostokątny
        o przyprostokątnych składających się z n-razy * (gwiazdki) np. podając n = 5 powinniśmy otrzymać taki trójkąt:
        *
        **
        ***
        ****
        *****
        */

        int n = 5;
        int gwiazdki = 1;

        for(int i = 1 ; i <= n ; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
