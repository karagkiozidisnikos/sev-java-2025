package gr.aueb.sev.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη του base^power
 * με τη χρήση μεθόδου
 */

public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please insert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = power(base, power);

        System.out.printf("%d ^ %d = %,d", base, power, result);
    }

    /**
     * Finds the base ^ power
     * @param base the base of power
     * @param power the power raised to
     * @return the base raised to the power
     */
    public static int power(int base, int power) {
        int result = 1;

        for(int i = 1; i <= power; i++) {
            result *= base;
        }

        return result;
    }
}
