package gr.aueb.sev.ch2;

import java.util.Scanner;

/**
 * Εμφάνιση ημερομηνίας
 */
public class DateApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Παρακαλώ εισάγετε ημέρα");
        do {
            day = scanner.nextInt();

            if (day < 0 || day > 31) {
                System.out.println("Παρακαλώ εισάγετε σωστή ημέρα");
                continue;
            }
            break;

        } while (true);

        System.out.println("Παρακαλώ εισάγετε μήνα");
        do {
            month = scanner.nextInt();

            if (month < 0 || month > 12) {
                System.out.println("Παρακαλώ εισάγετε σωστό μήνα");
                continue;
            }
            break;

        } while (true);

        System.out.println("Παρακαλώ εισάγετε έτος");
        do {
            year = scanner.nextInt();

            if (year < 0) {
                System.out.println("Παρακαλώ εισάγετε σωστό έτος");
                continue;
            }

            break;

        } while (true);

        System.out.printf("Η ημερομήνια είναι %02d/%02d/%d", day, month, year);
    }
}
