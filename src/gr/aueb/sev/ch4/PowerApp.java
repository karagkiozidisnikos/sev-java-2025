package gr.aueb.sev.ch4;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη το base και το power
 * Υπολογίζει τη δύναμη του base^power
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Παρακαλώ εισάγετε base και power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i ++) {
            result *= base;
        }

        System.out.printf("Η δύναμη του %d ^ %d είναι %d", base, power, result);

    }

}
