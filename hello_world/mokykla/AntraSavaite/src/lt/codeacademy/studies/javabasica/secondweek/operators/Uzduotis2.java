package lt.codeacademy.studies.javabasica.secondweek.operators;

import java.util.Random;
import java.util.Scanner;

public class Uzduotis2 {

    static Scanner scanner;

    static Random random;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        random = new Random();

        int value = 0;
        while (value != 100) {
            System.out.println("\nSugeneruotas skaicius: " + value + "\n");
            value = random.nextInt();
            return;
        }

        int valueKitas;
        do {
            System.out.println("Sugeneruoti 10 atsitiktiniu skaiciu: " + value + "\n");
            valueKitas = random.nextInt();
        } while (valueKitas != 100)





//        System.out.println("Pirmas sakinio žodis: " + sakinys.split(SEPARATOR)[0] + ".");
    }

//    private static String ivesti() {
//        Scanner sc = new Scanner(System.in);
//        return sc.nextLine();
//    }
}
