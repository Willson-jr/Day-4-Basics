package Kolekcje;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Reader.readNumberListFromScanner();
        //List<Integer> sorted = Reader.getSortedList(numbers);
        Collections.sort(numbers);
        Set<Integer> elements = new HashSet<>();
        for (Integer number : numbers) {
                if (!elements.contains(number)){
                System.out.println(number+" appears "+ Collections.frequency(numbers,number) + " times");
                elements.add(number);
            }
        }

//      temp.get(i) == temp.get(temp.size()-1)
//        for (int i = 0; i < temp.size()-1; i++) {
//            int count = 0;
//            if (temp.get(i) != temp.get(i+1) || temp.get(i) == null){
//                int tempNum = temp.get(i);
//                for (int j = 0; j < temp.size(); j++) {
//                    if (tempNum == temp.get(j)) {
//                        count++;
//                    }
//
//                }
//                System.out.println("Number "+ temp.get(i)+ " appears "+ count);
//            }
//
//        }
    }

}


    

