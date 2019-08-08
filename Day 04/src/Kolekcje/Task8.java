package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println(reverse(numbers));



    }

    public static List<Integer> reverse(List<Integer> numbers) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            reversed.add( numbers.get(numbers.size()-1-i));


        } return reversed;
    }
}
