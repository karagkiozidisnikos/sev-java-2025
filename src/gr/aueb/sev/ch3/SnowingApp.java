package gr.aueb.sev.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει ή όχι, με βάση τη θερμοκρασία
 * αλλά και το αν βρέχει. Αν βρέχει και η θερμοκρασία είναι
 * < 0 τότε χιονίζει, αλλιώς όχι
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Παρακαλώ πείτε μας αν βρέχει (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασία");
        temp = scanner.nextInt();

        isSnowing = isRaining && (temp < 0); // Short-circuit

        System.out.println("Is snowing: " + isSnowing);
    }
}
