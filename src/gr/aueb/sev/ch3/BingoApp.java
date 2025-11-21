package gr.aueb.sev.ch3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Ο χρήστης προσπαθεί να βρει ένα μυστικό κλειδί
 * (ακέραιο) και λαμβάνει κατάλληλο μήνυμα αν το βρήκε
 * ή όχι
 */
public class BingoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int inputNum = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε έναν ακέραιο");
            inputNum = scanner.nextInt();

            if (inputNum == SECRET_KEY) {
                System.out.println("BINGO");
                break;
            } else {
                System.out.println("Not found. Try again");
            }
        }

        System.out.println("Thank you for using the app!");
    }
}
