package gr.aueb.sev.ch1;


/**
 * Εκτυώνει ένα μενού επιλογών
 */

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
        System.out.println("Δώστε αριθμό επιλογής:");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Επιλέξατε Εισαγωγή");
                break;
            case 2:
                System.out.println("Επιλέξατε Διαγραφή");
                break;
            case 3:
                System.out.println("Επιλέξατε Αναζήτηση");
                break;
            case 4:
                System.out.println("Επιλέξατε Ενημέρωση");
                break;
            case 5:
                System.out.println("Επιλέξατε Έξοδο");
                break;
        }

    }
}
