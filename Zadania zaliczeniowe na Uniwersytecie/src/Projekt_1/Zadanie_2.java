package Projekt_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        String inputFile = "liczby2.txt";
        String outputFile = "wynik2.txt";

        // Odczytanie liczb z pliku liczby2.txt
        ArrayList<Integer> numbers = readNumbersFromFile(inputFile);

        // Wyodrębnienie wszystkich liczby półpierwszych
        ArrayList<Integer> semiprimes = findSemiprimes(numbers);

        // Zapisanie liczb półpierwszych do pliku wynik2.txt
        saveNumbersToFile(semiprimes, outputFile);
    }

    // Metoda do odczytu liczb z pliku
    private static ArrayList<Integer> readNumbersFromFile(String filename) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    // Metoda do wyodrębnienia wszystkich liczb półpierwszych
    private static ArrayList<Integer> findSemiprimes(ArrayList<Integer> numbers) {
        ArrayList<Integer> semiprimes = new ArrayList<>();
        for (int number : numbers) {
            if (isSemiprime(number)) {
                semiprimes.add(number);
            }
        }
        return semiprimes;
    }

    // Metoda sprawdzająca, czy liczba jest liczbą pierwszą
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Metoda sprawdzająca, czy liczba jest liczbą półpierwszą
    private static boolean isSemiprime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && isPrime(i) && isPrime(number / i)) {
                return true;
            }
        }
        return false;
    }

    // Metoda do zapisu liczb do pliku
    private static void saveNumbersToFile(ArrayList<Integer> numbers, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (int number : numbers) {
                writer.write(number + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
