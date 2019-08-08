package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Pies","dog");
        dictionary.put("kot","cat");
        dictionary.put("czesc","hi");
        dictionary.put("milosc","love");
        dictionary.put("dom","house");
        dictionary.put("pilka","ball");

        System.out.println("podaj słowo po Polsku");
        String word = scanner.next();
        if (dictionary.containsKey(word)) {
            System.out.println("po angielsku "+dictionary.get(word));
        } else {
            System.out.println("dupa");
        }
        System.out.println("podaj");
        int number = scanner.nextInt();
        System.out.println(Integer.toBinaryString(number));
    }
}
