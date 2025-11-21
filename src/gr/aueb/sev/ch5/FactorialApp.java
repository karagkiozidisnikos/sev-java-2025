package gr.aueb.sev.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει με μέθοδο το παραγοντικό του n
 * n! = 1 * 2 * 3 * ... * n
 * Για παράδειγμα το 3! = 1 * 2 * 3
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int result = 0;

        System.out.println("Please insert an integer");
        a = scanner.nextInt();

        result = facto(a);

        System.out.println("The factorial of " + a + " is " + result);
    }

    public static int facto(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
