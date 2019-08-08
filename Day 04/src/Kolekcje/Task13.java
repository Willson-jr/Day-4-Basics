package Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> colors = new ArrayList();
        String stopWord = "";
        while (!stopWord.equals("stop")) {
            String word = scanner.next();
            if (word.equals("stop")) {
                break;
            } else {
                colors.add(word);
            }
        }
        System.out.println(getNumberDifferentWords(colors));

//        for (String word : colors) {
//            System.out.println(word);
//        }
    }

    public static int getNumberDifferentWords(List<String> words) {
        List<String> temp = new ArrayList<>();
        for (String word : words) {
            if (!temp.contains(word)) {
                temp.add(word);
            }
        }
        int count = temp.size();
        return count;
    }
}





