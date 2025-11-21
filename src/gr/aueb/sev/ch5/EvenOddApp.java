package gr.aueb.sev.ch5;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Ορίζει δύο μεθόδους isEven και isOdd
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο");
        num = scanner.nextInt();


        if (isEven(num)) {
            System.out.println("Ο αριθμός είναι άρτιος");
        } else if(!isEven(num)){
            System.out.println("O αριθμός είναι περιττός");
        }

    }

    public static boolean isEven(int input) {
        return input % 2 == 0;
    }

    public static boolean isOdd(int input) {
        return !isEven(input);
    }
}
