package Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static List<String> readStringListFromScanner() {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile elementow chcez dodac?");
        int n = scanner.nextInt();
        // dodajemy n Stringow za pomoca pętli for do naszej listy
        for (int i = 0; i < n; i++) {
           list.add(scanner.next());
           /*
           odpowiednik linejek;
           String word = scanner.next();
           list.add(word);
            */
        } return list;
    }
    public static List<Integer> readNumberListFromScanner() {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile elementow chcez dodac?");
        int n = scanner.nextInt();
        // dodajemy n Stringow za pomoca pętli for do naszej listy
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
           /*
           odpowiednik linejek;
           String word = scanner.next();
           list.add(word);
            */
        } return list;
    }
    static List<Integer> getSortedList(List<Integer> numbers) {
        List<Integer> sorted2 = numbers;
        Collections.sort(sorted2);
        return sorted2;
    }
}
