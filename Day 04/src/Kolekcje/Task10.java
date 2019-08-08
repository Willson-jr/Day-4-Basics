package Kolekcje;

import java.util.LinkedList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println(numbers);
        numbers.add(2, 1234);
        System.out.println(numbers);
        System.out.println(switchNumbers(0,2,numbers));
    }
    static List<Integer> switchNumbers (Integer first, Integer second, List<Integer> numbers) {

        Integer temp = numbers.get(second);
        numbers.set(second, numbers.get(first));
        numbers.set(first, temp);

        return numbers;
    }

}


