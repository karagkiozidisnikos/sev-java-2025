package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το απόλυτο ενός ακεραίου
 */
public class TernaryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο");
        num = scanner.nextInt();

        abs = (num > 0) ? num : -num;

//        if (num  < 0 ){
//            abs = -num;
//        } else {
//            abs = num;
//        }

        System.out.printf("Absolut of %d is %d", num, abs);
    }
}
