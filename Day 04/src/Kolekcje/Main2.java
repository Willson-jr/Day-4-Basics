package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    /*
    Odczytac imiona osob korzystac z Readers
    i wypisac tylko te, ktore zaczynaja sie na a
     */
    public static void main(String[] args) {
        List<String> names = Reader.readStringListFromScanner();
        List<String> namesWithA = startWithA(names);
        System.out.println(namesWithA);

//    for( String name : names) {
////        if (name.startsWith("A") {
////            System.out.println(name);
////        }
////    }
//        for (String name: names) {
//            System.out.println(name);
//        }
//        String name;
//        for (int i = 0; i <names.size() ; i++) {
//            name = names.get(i);
//            System.out.println(name);
//        }
    }
    static List<String> startWithA (List<String> array){
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < array.size()-1; i++) {
            if (array.get(i).startsWith("A") || array.get(i).startsWith("a")) {
                newList.add(array.get(i));
            }
        }
        return newList;
    }
}
