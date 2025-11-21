package gr.aueb.sev.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please enter a numerator and a dominator");
        numerator = sc.nextInt();
        denominator = sc.nextInt();

        result = numerator / denominator;

        System.out.printf("%d / %d = %d", numerator, denominator, result);
    }
}
