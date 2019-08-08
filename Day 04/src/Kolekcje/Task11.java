package Kolekcje;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        ArrayList<Integer> anotherNumbers = new ArrayList<>(numbers);
        System.out.println(numbers);
        System.out.println(anotherNumbers);
    }
}
