package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println(getMax(numbers));
    }

    static int getMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        } return max;
    }
}
