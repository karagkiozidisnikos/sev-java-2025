package gr.aueb.sev.ch7;

import java.util.Scanner;

/**
 * Demonstrates Scanner reads strings from standard input
 * Shows the difference between next() and nextline()
 */
public class StringInputApp {

    public static void main(String[] args) {
        // System.in => InputStream : Ρεύμα εισόδου (input) το οποίο διαβάζει δεδομένα από το πληκτρολόγιο
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Please insert string that ends with white space (space, tab, enter):");
        str = sc.next(); // Reads up to the next whitespace
        System.out.println("You entered (using next()): " + str );

        // Consume the leftover new line from pressing Enter
        sc.nextLine();

        // System.out => PrintStream : Ρεύμα εξόδου (output) το οποίο εκτυπώνει δεδομένα στην κονσόλα
        System.out.println("Please insert a new String:");
        str = sc.nextLine(); // Reads the entire line
        System.out.println("You entered (using nextline()) " + str );

        // System.err => PrintStream : Ρεύμα εξόδου (output) το οποίο εκτυπώνει μηνύματα σφάλματος
        System.err.println("This is an Error message");
    }
}
