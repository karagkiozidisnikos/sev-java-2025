package gr.aueb.sev.ch4;

/**
 * Εκτυπώνει κάθε iteration number
 */
public class ForApp {

    public static void main(String[] args) {

        int num = 10; // local scope - local variable

        for(int i = 1; i <= 10; i++){  // block scope variable
            System.out.print(i + " ");
        }

        //System.out.println(i); // Παράγει error καθώς η i ζει μόνο εντός της for
    }
}
