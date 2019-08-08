package Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> colors = new ArrayList();
        String stopWord = "";
        while (!stopWord.equals("stop")) {
            String word = scanner.next();
            if (word.equals("stop")){
                break;
            } else {
                colors.add(word);
            }
        }

        for (String word : colors) {
            System.out.println(word);

        }

    }
}
