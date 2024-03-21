package Projekt_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        // Odczytanie liczb z pliku liczby1.txt i zapisanie ich do tablicy int
        String inputFile = "liczby1.txt";
        ArrayList<Integer> numbers = readNumbersFromFile(inputFile);

        // Obliczenie sumy, średniej arytmetycznej i średniej geometrycznej
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        double geometricMean = calculateGeometricMean(numbers);

        // Wyświetlenie wyników
        System.out.println("Suma: " + sum);
        System.out.println("Średnia arytmetyczna: " + average);
        System.out.println("Średnia geometryczna: " + geometricMean);

        // Przepisanie liczb pierwszych do pliku wynik1P.txt
        ArrayList<Integer> primes = findPrimes(numbers);
        saveNumbersToFile(primes, "wynik1P.txt");

        // Przepisanie liczb doskonałych do pliku wynik1D.txt
        ArrayList<Integer> perfectNumbers = findPerfectNumbers(numbers);
        saveNumbersToFile(perfectNumbers, "wynik1D.txt");
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

    // Metoda do obliczenia sumy liczb w tablicy
    private static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Metoda do obliczenia średniej arytmetycznej liczb w tablicy
    private static double calculateAverage(ArrayList<Integer> numbers) {
        int sum = calculateSum(numbers);
        return (double) sum / numbers.size();
    }

    // Metoda do obliczenia średniej geometrycznej liczb w tablicy
    private static double calculateGeometricMean(ArrayList<Integer> numbers) {
        double product = 1.00;
        for (int number : numbers) {
            product *= number;
        }
        return Math.pow(product, 1.0 / numbers.size());
    }

    // Metoda do znalezienia liczb pierwszych w tablicy
    private static ArrayList<Integer> findPrimes(ArrayList<Integer> numbers) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
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

    // Metoda do znalezienia liczb doskonałych w tablicy
    private static ArrayList<Integer> findPerfectNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (isPerfect(number)) {
                perfectNumbers.add(number);
            }
        }
        return perfectNumbers;
    }

    // Metoda sprawdzająca, czy liczba jest liczbą doskonałą
    private static boolean isPerfect(int number) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                sum += number / i;
            }
        }
        return sum == number && number != 1;
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
