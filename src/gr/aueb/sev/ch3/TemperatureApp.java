package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Αν η θερμοκρασία < 0 τότε το
 * isBelowZero γίνεται true αλλιώς
 * γίνεται false. Ο χρήστης δίνει τη θερμοκρασία
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTempBelowZero = false;
        int temp = 0;

        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασία");
        temp = scanner.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("Temperature is below zero: " + isTempBelowZero);
/*
        if (temp < 0 ) {
            isTempBelowZero = true;
        }
*/

    }
}
