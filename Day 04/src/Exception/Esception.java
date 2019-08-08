package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Esception {

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0]=5;
        array[1]=2;
        try {
            System.out.println(array[6]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Nieprawisłowy indeks tablicy");
        }

        try {
            FileReader file = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        }

        String name = "Michał";

        try {
            name.charAt(-5);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Zły indeks Stringa");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        try {
            int number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podałes nie liczbe");
        }
        System.out.println("das");
    }
}
