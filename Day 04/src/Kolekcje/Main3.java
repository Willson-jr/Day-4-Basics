package Kolekcje;

import java.sql.SQLOutput;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();

        emails.add("ss@gmail.com");
        emails.add("michal2@wp.pl");
        emails.add("piotrek12@gmail.com");
        emails.add("wojciek123@wp.com");
        emails.add("michal2@wp.pl");

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj");
        String email = scanner.next();
        if (emails.contains(email)){
            System.out.println(" email already exists");
        } else {
            emails.add(email);
        }
        System.out.println("all emails"+emails);

        Set<String> set = new HashSet<>();
        //new LinkedHashSet
        set.add("ss@gmail.com");
        set.add("michal2@wp.pl");
        set.add("piotrek12@gmail.com");
        set.add("wojciek123@wp.com");
        set.add("michal2@wp.pl");
    }
}
