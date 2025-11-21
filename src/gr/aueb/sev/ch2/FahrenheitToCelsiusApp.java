package gr.aueb.sev.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει μια θερμοκρασία σε Fahrenheit και
 * μετατρέπεται σε Celsius
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        double result = 0;

        System.out.println("Παρακαλώ εισάγετε θερμοκρασία σε Fahrenheit");
        temp = scanner.nextInt();

        result = (double) 5 * (temp - 32) / 9;

        System.out.printf("Η θερμοκρασία %d°F σε βαθμούς Κελσίου είναι %.2f°C",temp, result);
    }
}
