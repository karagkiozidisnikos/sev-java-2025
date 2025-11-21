package gr.aueb.sev.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το τετράγωνο ενός αριθμού
 * με τη χρήση μεθόδου
 */

public class SquareApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int result = 0;

        System.out.println("Παρακαλώ εισάγτε τον αριθμό");
        base = scanner.nextInt();

        result = power(base);

        System.out.printf("Το τετράγωνο του %d είναι το %,d\n", base, result);
    }

    /**
     * Finds the base ^ power
     * @param base the base of power
     * @return the base raised to the power
     */
    public static int power(int base) {
        int result = 1;

        for(int i = 1; i <= 2; i++) {
            result *= base;
        }

        return result;
    }
}
