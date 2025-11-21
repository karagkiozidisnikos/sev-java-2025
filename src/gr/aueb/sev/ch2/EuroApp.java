package gr.aueb.sev.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει Euro σε USA dollars και cents
 * Για παράδειγμα, αν η ισοτιμία ευρώ - δολαρίου
 * είναι 1 euro = 99 USA cents, τότε τα 11 euros = 1089 USA cents
 * Άρα 10 euros είναι 9 USA dollars και 90 cents
 */
public class EuroApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int euros = 0;
        int dollars = 0;
        int cents = 0;
        int totalCents = 0;
        final int PARITY = 99;

        //Εντολές και επεξεργασία
        System.out.println("Παρακαλώ εισάγετε ένα ποσό σε euros");
        euros = scanner.nextInt();
        totalCents = PARITY * euros; //Αν δεν το είχα σε final δεν θα καταλάβαινα τι είναι το 99 - ισοτιμία
        dollars = totalCents / 100;
        cents = totalCents % 100;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Τα %d ευρώ είναι %d δολάρια και %d cents", euros, dollars, cents);
    }
}
