package Projekt_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zadanie_3 {
    public static void main(String[] args) {
        String fileA = "liczby3a.txt";
        String fileB = "liczby3b.txt";
        String outputFile = "wynik3.txt";

        try {
            FileWriter writer = new FileWriter(outputFile);

            // Podpunkt a)
            int numberOfDigitsA = countDigits(fileA);
            writer.write("a) Liczba cyfr w pliku " + fileA + ": " + numberOfDigitsA + "\n");

            // Podpunkt b)
            int minNumberA = findMinNumber(fileA);
            writer.write("b) Najmniejsza liczba w pliku " + fileA + ": " + minNumberA + "\n");

            // Podpunkt c)
            int commonNumbersCount = countCommonNumbers(fileA, fileB);
            writer.write("c) Liczba liczb występujących jednocześnie w plikach " + fileA + " i " + fileB + ": " + commonNumbersCount + "\n");

            // Podpunkt d)
            int[] countsOfLastDigits = countLastDigits(fileA);
            writer.write("d) Zestawienie ilości liczb kończących się odpowiednio cyframi 0-9 w pliku " + fileA + ":\n");
            for (int i = 0; i < countsOfLastDigits.length; i++) {
                writer.write("Cyfra " + i + ": " + countsOfLastDigits[i] + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metoda do zliczania liczby cyfr w pliku
    private static int countDigits(String filename) {
        int count = 0;
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                count += line.length();
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    // Metoda do znalezienia najmniejszej liczby w pliku
    private static int findMinNumber(String filename) {
        int min = Integer.MAX_VALUE;
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return min;
    }

    // Metoda do zliczania liczby wspólnych liczb w dwóch plikach
    private static int countCommonNumbers(String filenameA, String filenameB) {
        Set<Integer> setA = new HashSet<>();
        int count = 0;
        try {
            File fileA = new File(filenameA);
            Scanner scannerA = new Scanner(fileA);
            while (scannerA.hasNextInt()) {
                setA.add(scannerA.nextInt());
            }
            scannerA.close();

            File fileB = new File(filenameB);
            Scanner scannerB = new Scanner(fileB);
            while (scannerB.hasNextInt()) {
                int number = scannerB.nextInt();
                if (setA.contains(number)) {
                    count++;
                }
            }
            scannerB.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    // Metoda do zliczania liczb kończących się na cyfry 0-9
    private static int[] countLastDigits(String filename) {
        int[] counts = new int[10];
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                int lastDigit = number % 10;
                counts[lastDigit]++;
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counts;
    }
}
