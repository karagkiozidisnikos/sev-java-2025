package gr.aueb.sev.ch4;

/**
 * Prints 10 horizontal starts
 */
public class Stars10App {

    public static void main(String[] args) {

        // Prints 10 horizontal stars
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        // Prints 10 vertical stars
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        // Prints 10 rows of 10 stars
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Prints 1, 2, 3, 4, ...10 * in each row
        for (int j = 10; j >= 1; j--) {
            for (int i = 1; i<= j; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
