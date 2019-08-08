package Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> colors = new ArrayList();
        String stopWord = "";
        while (!stopWord.equals("stop")) {
            System.out.println("enter color");
            String word = scanner.next();
            if (word.equals("stop")){
                break;
            } else {
                colors.add(word);
            }
        }
//        for (String word : colors) {
//            System.out.println(word);
//
//        }

        System.out.println("What color index you want to know?");
        String color = scanner.next();

        System.out.println(findIndexOfColor(color, colors));
    }


    static int findIndexOfColor(String color,List<String> colors){
        int index =0;
        if (colors.contains(color)) {
            index =  color.indexOf(color);
        }
        return index;
    }
}
