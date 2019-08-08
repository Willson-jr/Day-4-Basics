package Kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Reader.readNumberListFromScanner();
        List<Integer> sorted = getSortedList(numbers);
        //Collections.sort(numbers);
        System.out.println(sorted);
    }

    static List<Integer> getSortedList(List<Integer> numbers) {
        List<Integer> sorted2 = numbers;
        Collections.sort(sorted2);
        return sorted2;
    }
}
