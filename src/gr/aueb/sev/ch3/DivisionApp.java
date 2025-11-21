package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δύο ακεραίους, έναν αριθμητή
 * και έναν παρανομαστη και αν ο αριθμητής είναι 0
 * διακόπτεται το loop ενώ αν ο παρανομαστής είναι 0
 * συνεχίζει το while
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0; //αριθμητής
        int denominator = 0; //παρανομαστής
        int result = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε τον αριθμητή (0 για έξοδο)");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Quitting...");
                break;
            }

            System.out.println("Παρακαλώ εισάγετε τον παρανομαστή");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Λάθος, διαίρεση με το μηδέν");
                continue;
            }

            result = numerator / denominator;

            System.out.println("Το αποτέλεσμα της διαίρεση είναι " + result);

        }
    }
}
