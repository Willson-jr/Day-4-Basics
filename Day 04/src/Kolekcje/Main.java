package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("adamus");
        users.add("anna");
        users.add("zdzisław");
    // rozmiar
        System.out.println(users.size());
    //wszystkie wartosci
        for (String user: users) {
            System.out.println(user);
        }
    //usunienie
        users.remove("anna");
        users.add("bogusław");
        users.add(1,"anna");
        System.out.println(users.size());
        System.out.println(users);
    }

}
