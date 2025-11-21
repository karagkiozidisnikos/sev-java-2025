package gr.aueb.sev.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        try {
            // code that might cause an exception
            System.out.println("Please enter a numerator and a dominator");
            numerator = sc.nextInt();
            denominator = sc.nextInt();

            result = numerator / denominator;

            System.out.printf("%d / %d = %d", numerator, denominator, result);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide with zero");
            e.printStackTrace();
        } finally {
            System.out.println("\nThis code is executed in every possible situation");
        }

        // more code...
    }
}
