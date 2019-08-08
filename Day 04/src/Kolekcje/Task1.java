package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
//        List<Integer> numbers = Reader.readNumberListFromScanner();
//        List<Integer> divided = getDividedByThree(numbers);
//        System.out.println(divided);
        System.out.println(getDividedByThree(Reader.readNumberListFromScanner()));

    }

    static List<Integer> getDividedByThree(List<Integer> numbers) {
        List<Integer> divided = new ArrayList<>();

//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i)%3 ==0) {
//                divided.add(numbers.get(i));
//            }
//
//        }
        for (Integer integer : numbers) {
            if (integer%3 ==0) {
                divided.add(integer);
            }
        }


        return divided;
    }
}
